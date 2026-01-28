val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
val setOfNumbers = numbers.toSet()

val set1 = setOf(1,2,3)
val set2 = mutableSetOf(3, 4, 5)

set1.intersect(set2) // 3
set1.union(set2) // 1, 2, 3, 4, 5

val peopleAges = mutableMapOf<String, Int>(
    "Fred" to 30,
    "Ann" to 23
)

peopleAges.put("Barbara", 42)
peopleAges["Joe"] = 51

peopleAges.forEach { print("${it.key} is ${it.value}, ") }
// Fred is 31, Ann is 23, Barbara is 42, Joe is 51,

println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )
// Fred is 31, Ann is 23, Barbara is 42, Joe is 51

val filteredNames = peopleAges.filter { it.key.length < 4 }
println(filteredNames)
// {Ann=23, Joe=51}

val words = listOf("about", "acute", "balloon", "best", "brief", "class")
val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
    .shuffled() // [brief, balloon, best]
    .take(2) // [brief, balloon]
    .sorted() // [balloon, brief]

private var _currentScrambledWord = "test"
val currentScrambledWord: String
    get() = _currentScrambledWord

val triple: (Int) -> Int = { a: Int -> a * 3 }
println(triple(5))

private var wordsList: MutableList<String> = mutableListOf() // has a value at initialization
private lateinit var currentWord: String // needs to be assigned after initialization

var quantity : Int? = null
quantity ?: 0 // 0
quantity = 4
quantity ?: 0 // 4