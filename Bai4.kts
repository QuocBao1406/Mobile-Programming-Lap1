fun getValue(): Double {
    return 3.6
}

suspend fun processValue() {
    val value = getValue()
    // modify the value
}

object DataProviderManager {

}

try {
    // code that may throw an error
} catch (exception: Exception) {
    // handle the thrown exception
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

val direction = Direction.NORTH