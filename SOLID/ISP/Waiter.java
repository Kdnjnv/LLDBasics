package SOLID.ISP;

public class Waiter implements Servable {

    @Override
    public void serveCustomers() {
        System.out.println("serve Customer!");
    }
}
