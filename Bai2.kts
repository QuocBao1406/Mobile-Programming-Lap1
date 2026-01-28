import kotlin.math.PI

abstract class Dwelling() {
}

abstract class Dwelling() {
    abstract val buildingMaterial: String
}

abstract class Dwelling() {
    abstract fun floorArea(): Double
}

open class RoundHut(residents: Int) {
}

class SquareCabin : Dwelling()

val numbers = listOf(1, 2, 3, 4, 5, 6)

numbers.size

numbers[0]

listOf("red", "blue", "green").reversed()

val entrees = mutableListOf<String>()

entrees.add("spaghetti")

entrees[0] = "lasagna"

entrees.remove("lasagna")

val name = "Android"
println(name.length)

val radius = 2

kotlin.math.PI * radius * radius