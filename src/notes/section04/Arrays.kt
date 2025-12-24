package notes.section04

fun main() {
// From 30

// Array initialization:
    val names = arrayOf("Wayne", "John", "Joe") //String
    val ints = arrayOf(1, 2, 3, 4, 5) //Int
    val longs = arrayOf<Long>(1, 2, 3, 4, 5) //specify type Long

    val evens = Array(16) { i -> i * 2 } //lambda function initialization
    val thousand = Array(1000) { i -> i } //all ints from 1-1000
    val allZeroes = Array(100) {0}

    val mixedArray = arrayOf(1, "hello", 2L) //array of Any

// for primitive types, there are classes to declare arrays of those types
// these are passable to Java method params
    val ints1 = intArrayOf(1, 2, 3)
    val ints2 = IntArray(12) { i -> i }
// there are methods to get a special typed array from a general one
    val ints3 = ints.toIntArray()
}