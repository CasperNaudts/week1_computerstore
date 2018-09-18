package be.pxl.computerstore.hardware;

import java.util.Random;

public abstract class ComputerComponent {
    private String vendor;
    private String name;
    private double price;
    private String articleNumber;
    private static int number = 0;

    public ComputerComponent(String vendor, String name, double price) {
        this.vendor = vendor;
        this.name = name;
        this.price = price;
        number++;
        this.articleNumber = vendor.substring(3) + String.format("- %05d", number);
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
