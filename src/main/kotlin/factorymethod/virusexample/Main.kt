package factorymethod.virusexample

import factorymethod.documentexample.document.DocumentType
import factorymethod.documentexample.document.application.Application
import factorymethod.virusexample.VirusFactory.Companion.makeVirus

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
    val wordApplication = Application.getApplicationDocument(DocumentType.WORD)
    val wordDocument = wordApplication.createDocument()
    wordDocument.showDocumentInfo()

}