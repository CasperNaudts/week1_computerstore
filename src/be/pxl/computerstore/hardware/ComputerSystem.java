package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Computable;
import be.pxl.computerstore.util.TooManyPeripheralsException;

public class ComputerSystem implements Computable {
    private Processor processor;
    private HardDisk hardDisk;
    private ComputerCase computerCase;
    private Peripheral [] peripheral = new Peripheral[MAX_PERIPHERAL];
    public final static int MAX_PERIPHERAL = 3;

    public ComputerSystem() {
    }

    public ComputerSystem(Processor processor, HardDisk hardDisk, ComputerCase computerCase, Peripheral[] peripherals) {
        this.processor = processor;
        this.hardDisk = hardDisk;
        this.computerCase = computerCase;
        this.peripheral = peripherals;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public Peripheral[] getPeripherals() {
        return peripheral;
    }

    public void setPeripheral(Peripheral[] peripheral) {
        this.peripheral = peripheral;
    }

    public void addPeripheral (Peripheral peripheral) throws TooManyPeripheralsException{
        boolean found = false;
        for (int i = 0; i < this.peripheral.length ; i++){
            if (this.peripheral[i] == null){
                this.peripheral[i] = peripheral;
                found = true;
                break;
            }
        }
        if (!found){
            throw new TooManyPeripheralsException();
        }
    }

    public void removePeripheral(String articleNumber){
        for (int i = 0; i < this.peripheral.length ; i++){
            if (this.peripheral[i] != null && this.peripheral[i].getArticleNumber().equals(articleNumber)){
                this.peripheral[i] = null;
                break;
            }
        }
    }

    public int getNumberOfPeripherals(){
        int count = 0;
        for (int i = 0; i < peripheral.length ; i++){
            if (peripheral[i] != null){
                count++;
            }
        }
        return count;
    }

    @Override
    public double totalPriceExcl() {
        double total = 0;
        if (getProcessor() != null){
            total = getProcessor().getPrice();
        }
        if (getComputerCase() != null){
            total = total + getComputerCase().getPrice();
        }
        if (getHardDisk() != null){
            total = total + getHardDisk().getPrice();
        }

        for (int i = 0; i < getPeripherals().length ; i++){
            if (getPeripherals()[i] != null){
                total = total + getPeripherals()[i].getPrice();
            }
        }
        return total;
    }

    @Override
    public double totalPriceIncl() {
        return totalPriceExcl() * 1.21;
    }
}
