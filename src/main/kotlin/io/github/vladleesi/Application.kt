package io.github.vladleesi

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.github.vladleesi.plugins.configureRouting
import io.github.vladleesi.plugins.configureSerialization

fun main(args: Array<String>) {
    // TODO: Replace to flavors
    val port: Int = System.getenv("PORT")?.toInt() ?: 8080
    embeddedServer(Netty, port = port) {
        configureSerialization()
        configureRouting()
    }.start(wait = true)
}