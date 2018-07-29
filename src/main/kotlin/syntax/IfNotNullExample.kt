package syntax

fun main(args: Array<String>) {
    println("=================================")
    printIfNotNull(null)
    println("=================================")
    printIfNotNull("abc")
    println("=================================")
    printLengthIfNotNull(null)
    println("=================================")
    printLengthIfNotNull("abc")
    println("=================================")
}

fun printLengthIfNotNull(str: String?) {
    println(str?.length)
}

fun printIfNotNull(str: String?) {
    str?.let {
        println(it)
    }
}