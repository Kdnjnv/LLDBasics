package SOLID.SRP;

public class InvoiceCalculator {
    private Marker marker;
    private int quantity;
    
    public InvoiceCalculator(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateInvoice() {
        int total = this.quantity * marker.price;
        System.out.println("Invoice : " + total);
        return total;
    }
}

