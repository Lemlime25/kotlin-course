package notes.section04

fun main() {
// From 31, 32, 33

// Nullable type: add ? at the end of class name, instance can be either of the class or null
    var myString: String? = null
    //myString = "hello"

// to use methods/attributes of the class from the instance, must check if not null like smart casting
    if (myString != null) {
        println(myString.uppercase())
    }
    // OR with the safe operator (?)
    println(myString?.uppercase()) //if myString is null, returns null
    // prevents exceptions from being raised

// Elvis operator (?:)
    val str1 = myString ?: "default value" // if myString is null, define str as the default
// safe cast operator (as?)
    val str2 = myString as? String // will obviously not work, returns null

// if you have a nullable type object, but you want to assert in some code that it won't be null, use !!
// obviously not safe, could raise NullPointerException
    val str3 = myString!!.uppercase()

// let can be used to execute a lambda expression if something is not null (not its only use case)
    str1?.let { println(it) } // it refers to str1

// Array of nulls/nullable types
    val nullableInts = arrayOfNulls<Int?>(5) // all elements are initialized as null
}