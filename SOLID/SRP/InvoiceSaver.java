package SOLID.SRP;

public class InvoiceSaver {
    private InvoiceCalculator invoice;

    public InvoiceSaver(InvoiceCalculator invoice) {
        this.invoice = invoice;
    }
    public void saveInvoice() {
        System.out.println("saving invoice, Invoice: " + invoice.calculateInvoice());
    }
}
