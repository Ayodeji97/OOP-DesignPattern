package factorymethod.documentexample.document.application

import factorymethod.documentexample.document.Document
import factorymethod.documentexample.document.DocumentType

abstract class Application {
    abstract fun createDocument() : Document

    companion object {
        fun getApplicationDocument (documentType: DocumentType) : Application {
            return when(documentType) {
                DocumentType.DRAWING -> DrawingApplication()
                DocumentType.PDF -> PDFApplication()
                DocumentType.WORD -> WordApplication()
            }
        }
    }
}