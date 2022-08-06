package factorymethod.bakeryexample.bakeryapplication

import factorymethod.bakeryexample.Bakery
import factorymethod.bakeryexample.BreadProduct

class BreadFactory : BakeryFactory() {
    override fun makeProduct(): Bakery {
        return BreadProduct()
    }
}