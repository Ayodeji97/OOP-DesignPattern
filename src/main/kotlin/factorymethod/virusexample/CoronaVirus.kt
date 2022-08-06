package factorymethod.virusexample

class CoronaVirus  : Virus{
    override fun mutate() {
        println("Corona virus is mutating...")
    }

    override fun type() {
        println("The type of the virus is corona virus...")
    }
}