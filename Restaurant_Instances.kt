fun main()
{
    // Creating instances of the class Restaurants
    val restaurant1 = Restaurants("Thai Tonic", 3.5, 250.00)
    val restaurant2 = Restaurants("Lord of the Wings", 4.8, 900.00)
    val restaurant3 = Restaurants("Thai me Up", 3.7, 200.00, 9)
    val restaurant4 = Restaurants("Nin Com Soup", 3.1, 600.00)
    val restaurant5 = Restaurants("Life of Pie", 4.2, 250.00, 21)
    val restaurant6 = Restaurants("Indian Jones", 4.1, 300.00)
    val restaurant7 = Restaurants("Wish you were Beer", 3.9, 350.00)
    val restaurant8 = Restaurants("Nacho Daddy", 2.9, 100.00)
    val restaurant9 = Restaurants("The Dairy Godmother", 4.8, 900.00, 30)

    // Creating list of the instances
    val resList = listOf(restaurant1, restaurant2, restaurant3, restaurant4,
        restaurant5, restaurant6, restaurant7, restaurant8, restaurant9)

    // Printing
    for (res in resList)
        println(res)

    /*
    The Output will be:
    Restaurants@3fb6a447
    Restaurants@79b4d0f
    Restaurants@6b2fad11
    Restaurants@79698539
    Restaurants@73f792cf
    Restaurants@2ed94a8b
    Restaurants@38082d64
    Restaurants@dfd3711
    Restaurants@42d3bd8b

    Process finished with exit code 0
     */
    // Now let's convert Restaurant Class to Data Class

    /*
    Now, the output is:
    Restaurants(name=Thai Tonic, rating=3.5, cost=250.0)
    Restaurants(name=Lord of the Wings, rating=4.8, cost=900.0)
    Restaurants(name=Thai me Up, rating=3.7, cost=200.0)
    Restaurants(name=Nin Com Soup, rating=3.1, cost=600.0)
    Restaurants(name=Life of Pie, rating=4.2, cost=250.0)
    Restaurants(name=Indian Jones, rating=4.1, cost=300.0)
    Restaurants(name=Wish you were Beer, rating=3.9, cost=350.0)
    Restaurants(name=Nacho Daddy, rating=2.9, cost=100.0)
    Restaurants(name=The Dairy Godmother, rating=4.8, cost=900.0)

    Process finished with exit code 0
     */
}
