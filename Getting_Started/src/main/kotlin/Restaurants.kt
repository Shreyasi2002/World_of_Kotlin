// Primary Constructors, Secondary Constructors and Data Classes

data class Restaurants (var name: String = "Bread Zeppelin", var rating: Double = 4.4, var cost: Double = 550.00) // Primary Constructor
{
    private var noOfDishes: Int = 0

    // Secondary Constructor
    constructor(name: String, rating: Double, cost: Double, noOfDishes: Int): this(name, rating, cost)
    {
        this.noOfDishes = noOfDishes
    }
    // Secondary Constructors are rarely used...
}