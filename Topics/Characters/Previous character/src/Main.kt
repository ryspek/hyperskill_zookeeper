const val REPEAT_NUM = 4

fun main() {
    repeat(REPEAT_NUM) {
        var ch: Char = readln().first()
        println(--ch)
    }
}