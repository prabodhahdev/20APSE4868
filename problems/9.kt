
fun main() {
    val secret = (1..10).random()
    var guess: Int
    do {
        print("Guess a number (1-10): ")
        guess = readLine()!!.toInt()
    } while (guess != secret)
    println("Congrats! The number was $secret")
}