fun main() {
    println("hello world!")
}

main()

println("This is the text to print!")

//This is a comment line
//This is another comment

//Assign once, cannot change.
val age = "5"
val name ="Rover"

//Assign and change as needed.
var roll = 6
var rolledValue: Int = 4

println("You already ${age}!")
println("You are already ${age} days old, ${name}!")

fun printHello() {
    println("Hello kotlin")
}

printHello()

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}

printBorder("VKU", 3)

fun roll(): Int {
    val randomNumber = (1..6).random()
    return randomNumber
}

println(roll())

fun printBorder() {
    repeat(23) {
        print("=")
    }
}

printBorder()

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
    }
}

fun main1 () {
    val num = 4
    if(num > 4) {
        println("The variable is greater than 4")
    } else if (num == 4) {
        println("The variable is equal to 4")
    } else {
        println("The variable is less than 4")
    }
}

main1()

val luckyNumber: Int = 4

when (roll()) {
    luckyNumber -> println("You won!")
    1 -> println("So sorry! You rolled a 1. Try again!")
    2 -> println("Sadly, you rolled a 2. Try again!")
    3 -> println("Unfortunately, you rolled a 3. Try again!")
    4 -> println("No luck! You rolled a 4. Try again!")
    5 -> println("Don't cry! You rolled a 5. Try again!")
    6 -> println("Apologies! you rolled a 6. Try again!")
}

class Dice {
    var sides = 6

    fun roll() {
        val randomNumber = (1..6).random()
        println(randomNumber)
    }
}

Dice()