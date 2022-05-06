const val TEN = 10
const val HUNDRED = 100

fun main() {
    val num = readln().toInt()
    val ones = num % TEN
    val tens = num % HUNDRED / TEN
    val hundreds = num / HUNDRED
    print("$ones$tens$hundreds")
}