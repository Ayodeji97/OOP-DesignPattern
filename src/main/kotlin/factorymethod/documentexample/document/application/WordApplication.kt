package factorymethod.documentexample.document.application

import factorymethod.documentexample.document.Document
import factorymethod.documentexample.document.WordDocument

class WordApplication : Application() {
    override fun createDocument(): Document {
        return WordDocument()
    }
}