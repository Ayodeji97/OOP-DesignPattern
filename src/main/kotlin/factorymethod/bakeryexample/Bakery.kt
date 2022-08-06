package factorymethod.bakeryexample

interface Bakery {
    fun bake()
    fun sellBakeryProduct() {
        println("We sell all kind of bakery products...")
    }
}