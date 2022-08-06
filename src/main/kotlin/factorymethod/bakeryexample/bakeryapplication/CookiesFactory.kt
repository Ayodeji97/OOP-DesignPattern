package factorymethod.bakeryexample.bakeryapplication

import factorymethod.bakeryexample.Bakery
import factorymethod.bakeryexample.CookiesProduct

class CookiesFactory : BakeryFactory() {
    override fun makeProduct(): Bakery {
        return CookiesProduct()
    }
}