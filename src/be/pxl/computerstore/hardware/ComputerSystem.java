package be.pxl.computerstore.hardware;

public class ComputerSystem {
    private Processor processor;
    private HardDisk hardDisk;
    private ComputerCase computerCase;
    private Peripheral [] peripherals = new Peripheral[3];

    public ComputerSystem(Processor processor, HardDisk hardDisk, ComputerCase computerCase, Peripheral[] peripherals) {
        this.processor = processor;
        this.hardDisk = hardDisk;
        this.computerCase = computerCase;
        this.peripherals = peripherals;
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
        return peripherals;
    }

    public void setPeripherals(Peripheral[] peripheral) {
        this.peripherals = peripheral;
    }

    public void addPeripheral (Peripheral peripheral){
        for (int i = 0 ; i < peripherals.length ; i++){
            if (peripherals[i] == null){
                peripherals[i] = peripheral;
                break;
            }
        }
    }

    public int getNumberOfPheripherals(){
        int count = 0;
        for (int i = 0 ; i < peripherals.length ; i++){
            if (peripherals[i] != null){
                count++;
            }
        }
        return count;
    }

}
