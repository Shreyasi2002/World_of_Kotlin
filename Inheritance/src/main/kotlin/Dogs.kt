class Dogs (legs: Int, color: String): Animals(legs, color)
{
    // Overriding Methods
    override fun sound()
    {
        println("I bark ...... Bowwow Bowwow")
    }
}