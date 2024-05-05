import SOLID.SRP.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker("cello", "black", 10, 2024);
        InvoiceCalculator invoiceCalculator = new InvoiceCalculator(marker, 12);
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoiceCalculator);
        InvoiceSaver invoiceSaver = new InvoiceSaver(invoiceCalculator);
        Invoice invoice = new Invoice(invoiceCalculator, invoiceSaver, invoicePrinter);

        invoice.calculateInvoice();
        invoice.printInvoice();
        invoice.saveInvoice();

    }
}