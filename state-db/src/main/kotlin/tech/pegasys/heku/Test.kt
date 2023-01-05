import tech.pegasys.heku.util.RateTracker
import kotlin.time.Duration.Companion.minutes

fun main() {
    println("Hello")

    RateTracker(100, 1.minutes)
}