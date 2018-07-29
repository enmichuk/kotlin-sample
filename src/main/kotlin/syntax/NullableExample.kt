package syntax

fun main(args : Array<String>) {
    printNumbers("1", "2")
    printNumbers("1", "a")
}

fun parseInt(str: String): Int? {
    try {
        return Integer.parseInt(str)
    } catch (e: NumberFormatException) {}
    return null
}

fun printNumbers(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }
    else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}