package be.pxl.computerstore.hardware;

public class ComputerComponent {
    private String vendor;
    private String name;
    private double price;
    private String articleNumber;
    private static int count = 1;

    public ComputerComponent(String vendor, String name, double price) {
        this.vendor = vendor;
        this.name = name;
        this.price = price;
        this.setArticleNumber();
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    private void setArticleNumber() {
        StringBuilder number = new StringBuilder();
        number.append(this.vendor.toUpperCase().concat("XXX").substring(0, 3));
        number.append("-");

        StringBuilder numberString = new StringBuilder(Integer.toString(count));
        while (numberString.length() < 5) {
            numberString.insert(0, "0");
        }

        number.append(numberString.toString());
        ComputerComponent.count++;

        this.articleNumber = number.toString();
    }

    public String toString() {
        return name + " (" + articleNumber + ")";
    }

    public String getFullDescription() {
        StringBuilder text = new StringBuilder();
        text.append("ArticleNumber = ").append(this.articleNumber);
        text.append("\r\n");
        text.append("Vendor = ").append(this.vendor);
        text.append("\r\n");
        text.append("Name = ").append(this.name);
        text.append("\r\n");
        text.append("Price = ").append(this.price);
        text.append("\r\n");
        return text.toString();
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        ComputerComponent.count = count;
    }
}