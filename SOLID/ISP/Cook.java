package SOLID.ISP;

public class Cook implements RestorantEmployee{
    @Override
    public void washDishes() {
        throw new AssertionError("Cook can not wash dishes");
    }

    @Override
    public void cook() {
        System.out.println("Cook prepare food");
    }

    @Override
    public void serveCustomers() {
        throw new AssertionError("Cook can not serve customers");
    }
}
