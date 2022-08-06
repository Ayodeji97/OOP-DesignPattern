package factorymethod.virusexample

import factorymethod.bakeryexample.bakeryapplication.BakeryFactory
import factorymethod.bakeryexample.bakeryapplication.BakeryProductType

fun main() {

    /**
     * VIRUS EXAMPLE
    val makeCoronaVirus = makeVirus(VirusType.CORONA)
    makeCoronaVirus.type()
    makeCoronaVirus.mutate()

     **/

    /**
     * DOCUMENT EXAMPLE
     * */

    /**
     *        val wordApplication = Application.getApplicationDocument(DocumentType.WORD)
    val wordDocument = wordApplication.createDocument()
    wordDocument.showDocumentInfo()
     * */

    /***
     * BAKERY FACTORY
     * */

    val breadProduct = BakeryFactory.makeBakeryProduct(BakeryProductType.BREAD_PRODUCT)
    val makeBreadProduct = breadProduct.makeProduct()
    makeBreadProduct.bake()
    makeBreadProduct.sellBakeryProduct()

}