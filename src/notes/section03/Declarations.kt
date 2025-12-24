package notes.section03

fun main() {
// From 19, 20, 21

// Kotlin is statically typed
// Kotlin can infer a variable's type from its declaration
// val is immutable, var is mutable
// try to use val as much as possible; declare stuff as val unless var is needed

    val my_int1 = 10 // type Int is inferred
    val my_int2: Int // type Int is explicit, value assigned later
    val my_int3: Int = 10 // uncommon

// the class Any is the root of all classes (like Object in Java)
// you can declare variables as Any
}

// typealias declares a shorthand for some type
typealias StringSet = Set<String>

fun typeAliasEx() {
    val my_string_set: StringSet // used like any other data type
}
