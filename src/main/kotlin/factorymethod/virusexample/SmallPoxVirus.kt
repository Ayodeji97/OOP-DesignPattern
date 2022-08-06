package factorymethod.virusexample

class SmallPoxVirus : Virus {
    override fun mutate() {
        println("Small pox virus is mutating...")
    }

    override fun type() {
        println("The type of the virus is pox...")
    }
}