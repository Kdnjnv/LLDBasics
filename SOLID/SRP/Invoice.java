package SOLID.SRP;

public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateInvoice() {
        int total = this.quantity * marker.price;
        System.out.println("Invoice: " + total);
        return total;
    }
}
