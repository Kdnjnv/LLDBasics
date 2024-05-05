package SOLID.DI;

public class NormalMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("click with normal mouse");
    }
}
