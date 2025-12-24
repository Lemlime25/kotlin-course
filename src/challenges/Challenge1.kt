package challenges

fun main(args: Array<String>) {
    val hello1 = "Hello"
    val hello2 = "Hello"
    println(hello1 === hello2)
    println(hello1 == hello2)

    var myvar = 2988

    val myAny = "The Any type is the root of the Kotlin class hierarchy"
    if (myAny is String) {
        println(myAny.uppercase())
    }

    println("""   1
        |  11
        | 111
        |1111
    """.trimMargin())
    println("""1   1
        1  11
        1 111
        11111
    """.trimMargin("1"))
}