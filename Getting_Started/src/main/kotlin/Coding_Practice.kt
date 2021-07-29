/*
Create a list which contains math function operators (+, -, *, /) as characters. Iterate through this list and pass two variables along with the list item (operator) to a function and perform all the math functions on them. Perform the operation corresponding to the character encountered by the iterator.
Given:
Index of + is 0
Index of - is 1
Index of * is 2
Index of / is 3
In case of division check if the divisor is 0 or not.
 */

fun main()
{
    val mathOperators = listOf('+', '-', '*', '/')

    val num1 = 45
    val num2 = 0
    // Iterating through the list
    for (i in mathOperators)
    {
        println("Character '$i' encountered by the iterator... Operation performed: ${mathFunctions(num1, num2, i)}")
    }

}

fun mathFunctions(num1: Int, num2: Int, operator: Char): Any
{
    return if (operator == '+')
        num1 + num2
    else if (operator == '-')
        num1 - num2
    else if (operator == '*')
        num1 * num2
    else
    {
        if (num2 == 0) {
            println("This division cannot be performed. The divisor is 0.")
            "Error"
        }
        else
            num1 / num2
    }
}