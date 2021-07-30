fun main()
{
    // Creating instances for class Dogs
    val dog = Dogs(4, "Brown")
    dog.bark()
    dog.sleep()
    dog.eat()

    println()
    
    // Creating instance for class Cats
    val cat = Cats(4, "White")
    cat.meow()
    cat.sleep()
    cat.eat()
}