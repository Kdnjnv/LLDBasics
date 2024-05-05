package SOLID.SRP;

public interface InvoiceDao {
    public void save(Invoice invoice);
}

/***
 * It can be extented further like implementing SQLInvoiceDao and it will satisfy OCP
 */
