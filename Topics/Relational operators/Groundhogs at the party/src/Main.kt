fun main() {
    val cups = readln().toInt()
    val isWeekend = readln().toBoolean()
    if (isWeekend) {
        println(isPartySuccessfulOnWeekend(cups))
    } else {
        println(isPartySuccessfulOnWeekday(cups))
    }
}

fun isPartySuccessfulOnWeekend(num: Int): Boolean {
    val min = 15
    val max = 25
    return num in min..max
}

fun isPartySuccessfulOnWeekday(num: Int): Boolean {
    val min = 10
    val max = 20
    return num in min..max
}