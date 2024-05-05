package SOLID.DI;

import java.security.Key;

public class NormalKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Type with normal keyboard");
    }
}
