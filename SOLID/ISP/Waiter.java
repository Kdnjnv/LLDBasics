package SOLID.ISP;

public class Waiter implements RestorantEmployee {
    @Override
    public void washDishes() {
        throw new AssertionError("Waiter can not wash dishes");
    }

    @Override
    public void cook() {
        throw new AssertionError("waiter can not cook");
    }

    @Override
    public void serveCustomers() {
        System.out.println("serve Customer!");
    }
}
