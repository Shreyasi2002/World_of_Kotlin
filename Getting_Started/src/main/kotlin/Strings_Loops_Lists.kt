
fun main()
{
    val welcome = "Welcome to the World of Kotlin..."
    val stringLength = welcome.length

    println("Length of the string '$welcome' is $stringLength.")

    val welcome11 = welcome[11]
    println("The character at 11th index is '$welcome11'.")
    println("Subsequence: ${welcome.subSequence(0,7)}")
}