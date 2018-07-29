package syntax

fun main(args: Array<String>) {
    println(describe(1))
    println(describe("Hello"))
    println(describe(1L))
    println(describe('a'))
    println(describe("String"))
}

fun describe(obj: Any): String = when (obj) {
    1 -> "One"
    "Hello" -> "Greeting"
    is Long -> "Long"
    !is String -> "Not a string"
    else -> "Unknown"
}