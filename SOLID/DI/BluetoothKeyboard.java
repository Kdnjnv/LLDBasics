package SOLID.DI;

public class BluetoothKeyboard implements Keyboard{
    @Override
    public void type() {
        System.out.println("type with bluetooth keyboard");
    }
}
