package SOLID.SRP;

public class InvoiceSaver {
    private Invoice invoice;

    public InvoiceSaver(Invoice invoice) {
        this.invoice = invoice;
    }
    public void saveInvoice() {
        System.out.println("saving invoice, Invoice: " + invoice.calculateInvoice());
    }
}
