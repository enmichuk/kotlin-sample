package syntax

fun main(args: Array<String>) {
    val upper = "Convert this to camelcase".spaceToUpperCase()
    println(upper)
}

fun String.spaceToUpperCase(): String {
    return this.toUpperCase()
}