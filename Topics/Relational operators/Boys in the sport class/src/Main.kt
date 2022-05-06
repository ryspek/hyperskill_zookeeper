fun main() {
    val h1 = readln().toInt()
    val h2 = readln().toInt()
    val h3 = readln().toInt()

    val asc = h2 in h1..h3
    val desc = h2 in h3..h1

    println(asc || desc)
}