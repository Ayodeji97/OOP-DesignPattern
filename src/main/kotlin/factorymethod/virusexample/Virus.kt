package factorymethod.virusexample

interface Virus {
    fun mutate()
    fun spread() {
        println("Virus is spreading wide")
    }
    fun type()
}