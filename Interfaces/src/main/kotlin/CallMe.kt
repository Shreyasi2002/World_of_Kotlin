class CallMe : MyInterface, NewInterface
{
    override fun hello()
    {
        println("Hello.... I am called here :)")
    }

    override fun hi() {
        println("New Interface Function :|)")
    }
}