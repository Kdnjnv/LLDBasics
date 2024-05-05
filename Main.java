import SOLID.SRP.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker("cello", "black", 10, 2024);
        Invoice invoice = new Invoice(marker, 12);
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        InvoiceSaver invoiceSaver = new InvoiceSaver(invoice);

        System.out.println("Invoice: " + invoice.calculateInvoice());
        invoicePrinter.printInvoice();
        invoiceSaver.saveInvoiceToDB();
        invoiceSaver.saveInvoiceToFile();

    }
}