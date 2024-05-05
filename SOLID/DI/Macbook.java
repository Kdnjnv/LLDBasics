package SOLID.DI;


public class Macbook {
    private Keyboard keyboard;
    private Mouse mouse;

    public Macbook() {
        this.keyboard = new NormalKeyboard();
        this.mouse = new NormalMouse();
        //Class should depend on interface not Concrete class
    }

    public void type() {
        keyboard.type();
    }

    public void click() {
        mouse.click();
    }
}
