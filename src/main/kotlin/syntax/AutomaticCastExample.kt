package syntax

fun main(args: Array<String>) {
    println(getStringLength("abc"))
    println(getStringLength(3))
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}