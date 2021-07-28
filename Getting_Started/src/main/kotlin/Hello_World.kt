@file:JvmName("HelloWorldKt")

fun main(args: Array<String>)
{
    /*
    Covers:
    1. Variables
    2. Data Types
    3. Operators
     */
    println("Hello World!")
    println("Welcome to the world of Kotlin.")

    // Variables

    var name = "Shreyasi"
    var roll = 33
    var college = false
    var gpa = 8.45

    name += " Mandal"
    roll -= 33 - 200956
    college = !college
    gpa += 0.55

    val course = "Android App Development"
    val week = 2
    val completed = false
    val marks = 90.0

    // Printing out the variables
    println("Name: $name")
    println("Roll No: $roll")
    println("Going to College: $college")
    println("GPA: $gpa")

    println("Course I am studying: $course")
    println("WEEK: $week")
    println("Is the Course completed: $completed")
    println("Marks obtained: $marks")

    // Using Operators

    val num1 = 56.9
    val num2 = 67.4

    var result: Double = num1 * num2
    println(result)

    result = num1 + num2
    println(result)

    result += 100
    println(result)

    // Trickiness
    val a = 40
    val b = 40.0
    println(a + b)


}