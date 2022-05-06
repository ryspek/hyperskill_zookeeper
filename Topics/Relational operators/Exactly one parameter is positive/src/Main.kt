const val ZERO = 0

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val positiveA = a > ZERO && b <= ZERO && c <= ZERO
    val positiveB = b > ZERO && c <= ZERO && a <= ZERO
    val positiveC = c > ZERO && a <= ZERO && b <= ZERO

    println(positiveA || positiveB || positiveC)
}