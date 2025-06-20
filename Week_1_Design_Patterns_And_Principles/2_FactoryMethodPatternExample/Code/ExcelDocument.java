

public class ExcelDocument implements Document {
    

    @Override
    public void close() {
        System.out.println("Closing the Excel document.\n");
    }

    @Override
    public void open() {
        System.out.println("Opening the Excel document.");
    }
    
}
