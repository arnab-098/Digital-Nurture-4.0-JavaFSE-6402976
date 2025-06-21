//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        Document pdf = pdfFactory.createDocument();
        Document word = wordFactory.createDocument();
        Document excel = excelFactory.createDocument();

        pdf.getDocument();
        word.getDocument();
        excel.getDocument();
    }
}