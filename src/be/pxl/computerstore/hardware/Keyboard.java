package be.pxl.computerstore.hardware;

public class Keyboard extends Peripheral {
    private KeyboardLayout keyboardLayout;

    public Keyboard(String vendor, String name, double price, KeyboardLayout keyboardLayout) {
        super(vendor, name, price);
        this.keyboardLayout = keyboardLayout;
    }

    public KeyboardLayout getKeyboardLayout() {
        return keyboardLayout;
    }

    public void setKeyboardLayout(KeyboardLayout keyboardLayout) {
        this.keyboardLayout = keyboardLayout;
    }
}
