package SOLID.SRP;

public class Invoice {
    private Marker marker;
    private int quantity;
    
    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateInvoice() {
        //System.out.println("SOLID.SRP.Invoice amount is: " + (marker.price * quantity));
        return marker.price * quantity;
    }

    public void saveInvoice() {
        System.out.println("saving SOLID.SRP.Invoice to DB");
    }

    public void printInvoice() {
        System.out.println("printing SOLID.SRP.Invoice");
    }
}
