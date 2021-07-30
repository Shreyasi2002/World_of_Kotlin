fun main()
{
    // Creating instances for class Dogs
    val dog = Dogs(4, "Brown")
    dog.sound()
    dog.sleep()
    dog.eat()

    println()

    // Creating instance for class Cats
    val cat = Cats(4, "White")
    cat.sound()
    cat.sleep()
    cat.eat()
}