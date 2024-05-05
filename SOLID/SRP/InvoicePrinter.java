package SOLID.SRP;

public class InvoicePrinter {
    private InvoiceCalculator invoice;

    public InvoicePrinter(InvoiceCalculator invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.println("printing invoice, Invoice: " + invoice.calculateInvoice());
    }
}