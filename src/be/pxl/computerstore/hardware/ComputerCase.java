package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Dimension;

public class ComputerCase extends ComputerComponent{
    private Dimension dimension;
    private double weight;

    public ComputerCase(String vendor, String name, double price, Dimension dimension, double weight) {
        super(vendor, name, price);
        this.dimension = dimension;
        this.weight = weight;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
