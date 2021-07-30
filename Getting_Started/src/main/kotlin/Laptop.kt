class Laptop
{
    // Properties of the class
    var ram: Int = 4
    var brand: String = "Dell"
    var hdd: Int = 512   // hdd ~ Hard Disk Space

    // Behaviour of the class
    fun performComputations()
    {
        println("Performing computations.....")
        println("Please Wait ... :)\n\n")
    }
}

fun main()
{
    // Creating an instance/object of class Laptop
    val laptop1 = Laptop()

    println("RAM : ${laptop1.ram}")
    println("Brand : ${laptop1.brand}")
    println("Hard Disk Space : ${laptop1.hdd}\n")
    laptop1.performComputations()

    // Modifying the properties of the instance of class Laptop
    laptop1.brand = "Lenovo"
    laptop1.hdd = 256
    laptop1.ram = 8
    println("RAM : ${laptop1.ram}")
    println("Brand : ${laptop1.brand}")
    println("Hard Disk Space : ${laptop1.hdd}\n")
    laptop1.performComputations()

    // Creating another instance
    val laptop2 = Laptop()
    laptop2.brand = "HP"
    laptop2.hdd = 1024
    laptop2.ram = 16
    println("RAM : ${laptop1.ram}")
    println("Brand : ${laptop1.brand}")
    println("Hard Disk Space : ${laptop1.hdd}\n")
    laptop2.performComputations()

}