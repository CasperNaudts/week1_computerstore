package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Computable;

public class ComputerSystem implements Computable {
    private Processor processor;
    private HardDisk hardDisk;
    private ComputerCase computerCase;
    private Peripheral [] peripheral = new Peripheral[3];

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

    public Peripheral[] getPeripheral() {
        return peripheral;
    }

    public void setPeripheral(Peripheral[] peripheral) {
        this.peripheral = peripheral;
    }

    public void addPeripheral (Peripheral peripheral){
        for (int i = 0; i < this.peripheral.length ; i++){
            if (this.peripheral[i] == null){
                this.peripheral[i] = peripheral;
                break;
            }
        }
    }

    public int getNumberOfPheripherals(){
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
        double total;
        total = getProcessor().getPrice() + getComputerCase().getPrice() + getHardDisk().getPrice();

        for (int i = 0; i < getPeripheral().length ; i++){
            if (getPeripheral()[i] != null){
                total = total + getPeripheral()[i].getPrice();
            }
        }
        return total;
    }

    @Override
    public double totalPriceIncl() {
        return totalPriceExcl() * 1.21;
    }
}
