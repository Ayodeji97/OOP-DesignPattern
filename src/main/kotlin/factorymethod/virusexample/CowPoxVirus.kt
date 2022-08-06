package factorymethod.virusexample

class CowPoxVirus  : Virus{
    override fun mutate() {
        println("Cow pox virus is mutating...")
    }

    override fun type() {
        println("The type of the virus is cow pox...")
    }
}