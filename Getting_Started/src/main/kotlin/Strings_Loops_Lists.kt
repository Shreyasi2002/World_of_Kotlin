import kotlin.math.max

fun main()
{
    // Working with Strings
    val welcome = "Welcome to the World of Kotlin..."
    val stringLength = welcome.length

    println("Length of the string '$welcome' is $stringLength.")

    val welcome11 = welcome[11]
    println("The character at 11th index is '$welcome11'.")
    println("Subsequence: ${welcome.subSequence(0,7)}")

    // Working with functions
    newFunction()
    println("Multiplying 9 with 10 gives ${multiplyWith10(9)}")
    println("Maximum of 100 and 566 is ${calculateMaximum(100.0, 566.0)}")

    // Learning about Arrays
    val names = arrayOf("Shreyasi", "Ananya", "Bibhuti", "Ipsita", "Kavyajeet", "Bhupal", "Ila")

    /*
    Elements : "Shreyasi", "Ananya", "Bibhuti", "Ipsita", "Kavyajeet", "Bhupal", "Ila"
    Index :        0          1          2          3          4          5        6
     */

    println("Element at 4th index : ${names[4]}")

    // Playing around
    println("Let's see what's in there ______ ${names[5][4]}")

    println(names.contentToString())

    val marks = arrayOf(1, 3, 6.0, 9, 10, 5.6)
    println(marks.contentToString())

    // Conditionals and Loops

    val a = 78
    val b = 76
    val maxVal: Int = if(a > b)
    {
        a
    }
    else
    {
        b
    }
    println(maxVal)

    /*
    when(condition)
    {
        case1 -> Operation 1
        case2 -> Operation 2
        case3 -> Operation 3
        .
        .
        .
        ... and so on
        else -> If none of the above is executed, this operation is performed.
    }
     */

    when(9)
    {
        0 -> println("Zero")
        1 -> println("One")
        2 -> println("Two")
        else -> println("None of the above")
    }

    // Checking if a number is in range
    val number = 100
    if (number in 50..100)
        print("Number is in the range of 50 and 100 (both inclusive)")
    else
        print("Number is outside the range")

    // Loops

    println("FOR Loop")
    for (i in 1..10)
    {
        println("Value of i is $i now...")
    }

    println("WHILE Loop")
    var i = 1
    while (i <= 5)
    {
        println("Value of i is $i now...")
        i++
    }

    println("DO-WHILE Loop")
    var j = 1
    do
    {
        println("Value of j is $j now...")
        j++
    }
    while (j <= 5)

    // Sum of the first 50 natural numbers
    var sum = 0
    for (k in 1..50)
    {
        sum += k
    }
    println("Sum: $sum")

    // Incrementing by 3
    for (l in 1..60 step 3)
    {
        println("Incrementing l by 3... we get $l")
    }

    // Printing the prime numbers in decreasing order from 50 to 1
    for (n in 50 downTo 1)
    {
        var count = 0
        for (m in 1..n)
        {
            if (n % m == 0)
                count++
        }
        if (count == 2)
            println("$n is a prime number...")
    }
}

// Defining new function
// Expression Body
fun newFunction() = println("You are executing a new function :)")


// Block Body
fun multiplyWith10(a: Int): Int
{
    return a * 10
}

fun calculateMaximum(a: Double, b: Double): Double
{
    return max(a, b)
}