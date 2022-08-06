package factorymethod.bakeryexample.bakeryapplication

import factorymethod.bakeryexample.Bakery

abstract class BakeryFactory {
    abstract fun makeProduct() : Bakery

    companion object {
        fun makeBakeryProduct(bakeryProductType: BakeryProductType) : BakeryFactory {
            return  when (bakeryProductType) {
                BakeryProductType.BREAD_PRODUCT -> BreadFactory()
                BakeryProductType.COOKIES_PRODUCT -> CookiesFactory()
                BakeryProductType.PASTRIES_PRODUCT -> PastriesFactory()
            }
        }
    }
}


enum class BakeryProductType {
    BREAD_PRODUCT,
    COOKIES_PRODUCT,
    PASTRIES_PRODUCT
}
