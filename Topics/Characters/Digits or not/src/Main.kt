const val CHAR_NUM = 4

fun main() {
    repeat(CHAR_NUM) {
        println(readln().first().isDigit())
    }
}