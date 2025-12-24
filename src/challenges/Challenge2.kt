package challenges

fun main() {
    val float1 = -3847.384f
    val float2 = -3847.384.toFloat() //way too verbose

    val nfloat1: Float? = -3847.384f
    val nfloat2: Float? = -3847.384.toFloat() //way too verbose

    val myShorts1 = arrayOf<Short>(1, 2, 3, 4, 5) //with generic array
    val myShorts2: Array<Short> = arrayOf<Short>(1, 2, 3, 4, 5) //with generic array
    val myShorts3 = Array<Short>(5) { i -> i.toShort() } //with generic array
    val myShorts4 = shortArrayOf(1, 2, 3, 4, 5) //with special array

    val myNullableInts = Array<Int?>(40) { i -> (i+1) * 5 }
    for (i in myNullableInts) {
        println(i)
    }

    val myCharsForJava = charArrayOf('a', 'b', 'c')

    val x: String? = "I AM IN UPPERCASE"
    val y = x?.lowercase() ?: "I give up!"

    x?.let { it.lowercase().replace("am", "am not") }

    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()
}