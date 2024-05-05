package SOLID.SRP;

public class DatabaseInvoiceDao implements InvoiceDao{
    @Override
    public void save(Invoice invoice) {
        System.out.println("saving Invoice to DB Dao, Invoice: " + invoice.calculateInvoice());
    }
}
