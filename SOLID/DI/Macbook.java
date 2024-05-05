package SOLID.DI;

public class Macbook {
    private Keyboard keyboard;
    private Mouse mouse;

    public Macbook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        //Class should depend on interface not Concrete class
    }

    public void type() {
        keyboard.type();
    }

    public void click() {
        mouse.click();
    }
}
