package SOLID.SRP;

public class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.println("printing invoice, Invoice: " + invoice.calculateInvoice());
    }
}