package SOLID.SRP;

public class FileInvoiceDao implements InvoiceDao{
    @Override
    public void save(Invoice invoice) {
        System.out.println("Saving invoice to file Dao, Invoice: " + invoice.calculateInvoice());
    }
}
