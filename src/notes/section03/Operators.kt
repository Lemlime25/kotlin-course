package notes.section03

fun main() {
// From 22, 23, 24, 25

// equals differences:
// ==, != : structural, defers to the .equals() method
// ===, !=== : referential, compares to see if they're the exact same instances

// bitwise operators are words: and, or, xor
// is and !is operators syntax: Object is Type
    val x = 0 // random value for examples
    val my_bool = x is Int

// as is used for casting
    val my_int = x as Int
// smart casting: if already checked that something is a class, no need to cast since Kotlin knows obj is of the class

// template strings can be done with regular quotation marks, and using $varName for variables
    val my_string1 = "Pet $x, age: $x, price: \$100, discount: $$x" // \$ or $$ for $ symbol

// use trimMargin(symbol) on strings to format a long string by a margin identifying character
    val my_string2 = """Hello.
    |My name is...
    |...Wayne
""".trimMargin() // default symbol is |
}