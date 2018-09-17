package be.pxl.computerstore.hardware;

public class HardDisk {
    private String vendor;
    private String name;
    private double price;
    private int size;

    public HardDisk(String vendor, String name, double price, int size) {
        this.vendor = vendor;
        this.name = name;
        this.price = price;
        this.size = size;
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

    public int getSize() {
        return size;
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

    public void setSize(int size) {
        this.size = size;
    }
}
