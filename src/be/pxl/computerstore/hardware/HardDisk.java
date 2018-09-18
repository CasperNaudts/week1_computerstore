package be.pxl.computerstore.hardware;

public class HardDisk extends ComputerComponent {
    private int capacity;

    public HardDisk(String vendor, String name, double price, int capacity) {
        super(vendor, name, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void getFullDescription(){
        System.out.println("ArticleNumber = " + getArticleNumber());
        System.out.println("Vendor = " + getVendor());
        System.out.println("Name = " + getName());
        System.out.println("Price = " + getPrice());
        System.out.println("Capacity = " + getCapacity());
    }
}
