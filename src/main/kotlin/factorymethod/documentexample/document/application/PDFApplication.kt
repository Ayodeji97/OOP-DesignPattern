package factorymethod.documentexample.document.application

import factorymethod.documentexample.document.Document
import factorymethod.documentexample.document.PDFDocument

class PDFApplication : Application(){
    override fun createDocument(): Document {
        return PDFDocument()
    }
}