package dev.wolfort.chatroleplay.infrastructure.rdb

import dev.wolfort.chatroleplay.domain.model.player.Authority
import dev.wolfort.chatroleplay.domain.model.player.Player
import dev.wolfort.chatroleplay.domain.model.player.PlayerRepository
import dev.wolfort.dbflute.exbhv.DbPlayerAccountBhv
import dev.wolfort.dbflute.exbhv.DbPlayerAuthorityBhv
import dev.wolfort.dbflute.exbhv.DbPlayerBhv
import dev.wolfort.dbflute.exentity.DbPlayer
import org.springframework.stereotype.Repository

@Repository
class PlayerRepositoryImpl(
    private val playerBhv: DbPlayerBhv,
    private val playerAccountBhv: DbPlayerAccountBhv,
    private val playerAuthorityBhv: DbPlayerAuthorityBhv,
) : PlayerRepository {

    override fun find(id: Int): Player? {
        val optPlayer = playerBhv.selectEntity {
            it.query().setPlayerId_Equal(id)
        }
        if (!optPlayer.isPresent) return null
        val player = optPlayer.get()
        playerBhv.load(player) {
            it.loadPlayerAuthority { }
        }
        return mappingToPlayer(player)
    }

    override fun findByUsername(username: String): Player? {
        val optPlayer = playerBhv.selectEntity {
            it.setupSelect_PlayerAccountAsOne()
            it.query().queryPlayerAccountAsOne().setUsername_Equal(username)
        }
        if (!optPlayer.isPresent) return null
        val player = optPlayer.get()
        playerBhv.load(player) {
            it.loadPlayerAuthority { }
        }
        return mappingToPlayer(player)
    }

    override fun save(player: Player): Player {
        TODO("Not yet implemented")
    }

    private fun mappingToPlayer(dbPlayer: DbPlayer): Player {
        return Player(
            id = dbPlayer.playerId,
            name = dbPlayer.playerName,
            authorities = dbPlayer.playerAuthorityList.map {
                Authority.valueOf(it.authorityCode)
            }
        )
    }
}