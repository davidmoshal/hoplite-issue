import com.sksamuel.hoplite.ConfigLoader
import java.nio.file.Paths

data class EngineConfig(
        val env: String,
        val redis: RedisConfig,
        val db: DbConfig)

data class RedisConfig(
        val url: String,
        val requestChannel: String,
        val responseChannel: String)

data class DbConfig(
        val home: String,
        val configFile: String,
        val dbFile: String,
        val server: Boolean)

val config =
        ConfigLoader().loadConfigOrThrow<EngineConfig>(Paths.get("config/production.yaml"))


fun main(args: Array<String>) {
    println(config)
}

