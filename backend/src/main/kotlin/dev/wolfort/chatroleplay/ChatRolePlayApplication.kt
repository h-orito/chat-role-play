package dev.wolfort.chatroleplay

import dev.wolfort.chatroleplay.fw.SecurityConfig
import dev.wolfort.chatroleplay.fw.WebMvcConfigurer
import dev.wolfort.dbflute.allcommon.DbDBFluteBeansJavaConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(
    DbDBFluteBeansJavaConfig::class,
    WebMvcConfigurer::class,
    SecurityConfig::class
)
class ChatRolePlayApplication

fun main(args: Array<String>) {
    runApplication<ChatRolePlayApplication>(*args)
}
