fun main()
{
    // Handling Exceptions with try-catch block
    val array  = arrayOf(0, 100, 200, 300, 400, 500)
    try
    {
        println(array[6])
    }
    catch (e: ArrayIndexOutOfBoundsException)
    {
        println("Index 6 is out of the boundary of array : $array")
    }

    // Handling Null Pointer Exception
    var hello: String? = "Hello Kotlin"   // using null-safety operator (?)
    println("The length of the string $hello is ${hello?.length}")
    hello = null

    // Safe Call (?.)
    println("The length of the string $hello is ${hello?.length}")
    // Non-null Assertion operator (!!.)

    // Using Elvis Operator (?:)
    val number: Int? = null
    println("The value of the number using Elvis Operator is : ${number ?: 0.0}")

    // Printing the elements of a list/array without the null elements
    val list = mutableListOf(1, null, 2, 4, null, 6, 8, 10, null)
    list.add(7, 12)
    println("The list without null elements is : ${list.filterNotNull()}")

}