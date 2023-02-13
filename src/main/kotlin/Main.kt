import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main(args: Array<String>) {
    val port: Int = System.getenv("PORT")?.toInt() ?: 8080
    embeddedServer(Netty, port = port) {
        routing {
            get("/about") {
                call.respond("some text")
            }
        }
        install(ContentNegotiation) {
            json()
        }
    }.start(wait = true)
}