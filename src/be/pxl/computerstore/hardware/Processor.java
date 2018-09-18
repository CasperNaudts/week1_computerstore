package be.pxl.computerstore.hardware;

public class Processor extends ComputerComponent{
    private double clockspeed;

    public Processor(String vendor, String name, double price, double clockspeed) {
        super(vendor, name, price);
        setClockspeed(clockspeed);
    }

    public double getClockspeed() {
        return clockspeed;
    }

    public void setClockspeed(double clockspeed) {
        if (clockspeed > 0.7){
            this.clockspeed = clockspeed;
        } else {
            this.clockspeed = 0.7;
        }
    }
    public void getFullDescription(){
        System.out.println("ArticleNumber = " + getArticleNumber());
        System.out.println("Vendor = " + getVendor());
        System.out.println("Name = " + getName());
        System.out.println("Price = " + getPrice());
        System.out.println("Clock speed = " + getClockspeed() + "GHz");
    }
}
