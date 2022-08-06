package factorymethod.documentexample.document.application

import factorymethod.documentexample.document.Document
import factorymethod.documentexample.document.DrawingDocument

class DrawingApplication : Application() {
    override fun createDocument(): Document {
        return DrawingDocument()
    }
}