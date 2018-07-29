package syntax

fun main(args: Array<String>) {
    val p: String by lazy {
        println("start computing")
        "I'm computed lazily"
    }
    println("before printing variable")
    println(p)
}