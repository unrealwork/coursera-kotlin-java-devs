package basics

fun isValidIdentifier(s: String): Boolean {
    return s.matches(Regex("^([a-zA-Z]|_)([a-zA-Z]|\\d|_)+"))
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}
