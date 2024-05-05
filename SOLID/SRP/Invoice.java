package SOLID.SRP;

public class Invoice {
    private InvoiceCalculator invoiceCalculator;
    private InvoicePrinter invoicePrinter;
    private InvoiceSaver invoiceSaver;

    public Invoice(InvoiceCalculator invoiceCalculator, InvoiceSaver invoiceSaver, InvoicePrinter invoicePrinter) {
        this.invoiceCalculator = invoiceCalculator;
        this.invoiceSaver = invoiceSaver;
        this.invoicePrinter = invoicePrinter;
    }

    public void calculateInvoice() {
        int total = invoiceCalculator.calculateInvoice();
        System.out.println("why the helll you need this method Invoice: " + total);
    }

    public void saveInvoice() {
        invoiceSaver.saveInvoice();
    }

    public void printInvoice() {
        invoicePrinter.printInvoice();
    }


}
