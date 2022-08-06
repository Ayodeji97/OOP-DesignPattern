package factorymethod.documentexample.document

class WordDocument : Document {
    override fun showDocumentInfo() {
        println("This is Word Document...")
    }
}