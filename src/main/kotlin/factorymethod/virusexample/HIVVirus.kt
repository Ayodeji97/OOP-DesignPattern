package factorymethod.virusexample

class HIVVirus : Virus{
    override fun mutate() {
        println("HIV virus is mutating...")
    }

    override fun type() {
        println("The type of the virus is hiv...")
    }
}