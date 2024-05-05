import SOLID.SRP.Invoice;
import SOLID.SRP.Marker;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Marker marker = new Marker("cello", "black", 10, 2024);
        Invoice invoice = new Invoice(marker, 12);
        System.out.println("Invoice amount is: " + invoice.calculateInvoice());
    }
}