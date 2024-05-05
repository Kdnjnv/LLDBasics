import SOLID.ISP.Cook;
import SOLID.ISP.RestorantEmployee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RestorantEmployee cook = new Cook();
        cook.cook();
        cook.serveCustomers();
    }
}