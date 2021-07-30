// Primary Constructors, Secondary Constructors and Data Classes

class Resturants (var name: String, var rating: Double, var cost: Double) // Primary Constructor
{
    var noOfDishes: Int = 0

    // Secondary Constructor
    constructor(name: String, rating: Double, cost: Double, noOfDishes: Int): this(name, rating, cost)
    {
        this.noOfDishes = noOfDishes
    }
    // Secondary Constructors are rarely used...
}