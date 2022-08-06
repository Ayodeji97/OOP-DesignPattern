package factorymethod.bakeryexample.bakeryapplication

import factorymethod.bakeryexample.Bakery
import factorymethod.bakeryexample.PastriesProduct

class PastriesFactory : BakeryFactory() {
    override fun makeProduct(): Bakery {
        return PastriesProduct()
    }
}