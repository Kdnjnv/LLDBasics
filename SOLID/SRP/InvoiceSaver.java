package SOLID.SRP;

public class InvoiceSaver {
    private Invoice invoice;

    public InvoiceSaver(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveInvoiceToDB() {
        System.out.println("saving invoice to DB, Invoice: " + invoice.calculateInvoice());
    }

    public void saveInvoiceToFile() {
        System.out.println("Saving invoice to file");
    }
    //OCP voilation
}
