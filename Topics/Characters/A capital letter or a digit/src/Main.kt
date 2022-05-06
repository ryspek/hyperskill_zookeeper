fun main() {
    val ch: Char = readln().first()
    println(ch.isUpperCase() || ch.isDigit() && ch in '1'..'9')
}