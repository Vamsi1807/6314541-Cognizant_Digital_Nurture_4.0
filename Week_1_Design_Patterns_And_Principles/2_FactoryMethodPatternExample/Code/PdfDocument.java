

public class PdfDocument implements Document {

    @Override
    public void close() {
        System.out.println("Closing the PDF document.\n");
    }

    @Override
    public void open() {
        System.out.println("\nOpening the PDF document.");
    }
    
}
