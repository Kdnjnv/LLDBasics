package SOLID.ISP;

public class Cook implements Cookable{

    @Override
    public void cook() {
        System.out.println("Cook prepare food");
    }
}
