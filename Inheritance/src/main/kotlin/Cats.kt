class Cats (legs: Int, color: String): Animals(legs, color)
{
    // Overriding Methods
    override fun sound()
    {
        println("I purrr ...... Meow Meow")
    }
}