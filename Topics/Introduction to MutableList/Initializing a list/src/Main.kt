const val ZERO = 0
const val ONE = 1
const val NINE = 9
const val TEN = 10
const val ONE_HUNDRED = 100

fun main() {
    val numbers = MutableList(ONE_HUNDRED) { ZERO }

    numbers[ZERO] = ONE
    numbers[NINE] = TEN
    numbers[numbers.size - ONE] = ONE_HUNDRED

    // do not touch the lines below 
    println(numbers.joinToString())
}