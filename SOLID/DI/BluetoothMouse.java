package SOLID.DI;

public class BluetoothMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("click with bluetooth mouse");
    }
}
