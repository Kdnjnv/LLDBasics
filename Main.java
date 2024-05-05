import SOLID.ISP.Cook;
import SOLID.ISP.RestorantEmployee;
import SOLID.ISP.Waiter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cook cook = new Cook();
        cook.cook();

        Waiter waiter = new Waiter();
        waiter.serveCustomers();
    }
}