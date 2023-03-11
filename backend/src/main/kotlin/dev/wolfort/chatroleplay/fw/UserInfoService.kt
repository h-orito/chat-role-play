package dev.wolfort.chatroleplay.fw

import dev.wolfort.chatroleplay.domain.model.player.Authority
import dev.wolfort.chatroleplay.domain.model.player.Player
import dev.wolfort.chatroleplay.domain.model.player.PlayerRepository
import dev.wolfort.dbflute.exbhv.DbPlayerAccountBhv
import dev.wolfort.dbflute.exbhv.DbPlayerAuthorityBhv
import dev.wolfort.dbflute.exbhv.DbPlayerBhv
import dev.wolfort.dbflute.exentity.DbPlayer
import dev.wolfort.dbflute.exentity.DbPlayerAccount
import dev.wolfort.dbflute.exentity.DbPlayerAuthority
import org.dbflute.hook.AccessContext
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class UserInfoService(
    private val playerRepository: PlayerRepository,
    private val playerBhv: DbPlayerBhv,
    private val playerAccountBhv: DbPlayerAccountBhv,
    private val playerAuthorityBhv: DbPlayerAuthorityBhv,
) : UserDetailsService {

    @Throws(UsernameNotFoundException::class)
    override fun loadUserByUsername(username: String?): UserDetails {
        if (username.isNullOrEmpty()) {
            throw UsernameNotFoundException("Username is empty")
        }
        val player = playerRepository.findByUsername(username)
            ?: throw UsernameNotFoundException("User not found for name: $username")
        return UserInfo(
            userName = username,
            authorities = player.authorities
        )
    }

    fun register(username: String): UserDetails {
        playerRepository.findByUsername(username)?.let {
            throw IllegalStateException("already exists. username: $username")
        }
        val player = signup(username)
        return UserInfo(
            userName = username,
            authorities = player.authorities
        )
    }

    private fun signup(username: String): Player {
        findPlayerAccount(username)?.let {
            throw BusinessException("既にユーザーが存在します. username: $username")
        }
        if (!AccessContext.isExistAccessContextOnThread()) {
            val context = AccessContext()
            context.accessLocalDateTime = LocalDateTime.now()
            context.accessUser = "not login user"
            AccessContext.setAccessContextOnThread(context)
        }
        val playerId = insertPlayer()
        insertPlayerAccount(playerId, username)
        Authority.defaultAuthorities().forEach {
            insertPlayerAuthority(playerId, it)
        }
        return playerRepository.find(playerId)!!
    }

    private fun insertPlayer(): Int {
        val p = DbPlayer()
        p.playerName = "dummy"
        playerBhv.insert(p)
        return p.playerId
    }

    private fun findPlayerAccount(username: String): DbPlayerAccount? {
        return playerAccountBhv.selectEntity {
            it.query().setUsername_Equal(username)
        }.orElse(null)
    }

    private fun insertPlayerAccount(
        playerId: Int,
        username: String,
    ) {
        val a = DbPlayerAccount()
        a.playerId = playerId
        a.username = username
        playerAccountBhv.insert(a)
    }

    private fun insertPlayerAuthority(
        playerId: Int,
        authority: Authority
    ) {
        val a = DbPlayerAuthority()
        a.playerId = playerId
        a.authorityCode = authority.name
        playerAuthorityBhv.insert(a)
    }
}