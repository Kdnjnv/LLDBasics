import SOLID.DI.*;


import javax.crypto.Mac;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        NormalKeyboard normalKeyboard = new NormalKeyboard();
        BluetoothKeyboard bluetoothKeyboard = new BluetoothKeyboard();

        NormalMouse normalMouse = new NormalMouse();
        BluetoothMouse bluetoothMouse = new BluetoothMouse();

        Macbook NKNM = new Macbook(normalKeyboard, normalMouse);
        NKNM.type();
        NKNM.click();

        Macbook BKNM = new Macbook(bluetoothKeyboard, normalMouse);
        BKNM.type();
        BKNM.click();
    }
}