fun main() {
    var input: Int = readln().toInt()
    if (input % 2 == 0) {
        input += 2
    } else {
        input++
    }
    println(input)
}