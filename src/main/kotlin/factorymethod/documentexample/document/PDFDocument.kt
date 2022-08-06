package factorymethod.documentexample.document

class PDFDocument : Document {
    override fun showDocumentInfo() {
        println("This is PDF document ....")
    }
}