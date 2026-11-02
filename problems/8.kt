
fun main() {
    val numbers = listOf(-5, 3, 7, -2, 0, 10)
    var sum = 0

    for (num in numbers) {
        if (num > 0) {
            sum += num
        }
    }

    println("Sum of positive numbers: $sum")
}