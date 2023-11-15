public class Main {
    public static void main(String[] args) {
        // Buat objek CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        // Buat objek Processor
        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");
        i7.getProcessorInfo();

        // Buat objek RAM
        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");
        rs32GB.getInfoRAM();

        // Buat objek HardDisk
        CPU.HardDisk hd1TB = myKomputer.new HardDisk(1000, "Seagate");
        hd1TB.getHardDiskInfo();

        // Buat objek Motherboard
        CPU.Motherboard mbATX = myKomputer.new Motherboard("ATX", "ASUS");
        mbATX.getMotherboardInfo();

        // Buat objek PowerSupply
        CPU.PowerSupply ps650W = myKomputer.new PowerSupply(650, "Corsair");
        ps650W.getPowerSupplyInfo();

        // Buat objek VGACard
        CPU.VGACard nvidiaGTX = myKomputer.new VGACard("NVIDIA", "GTX 1080");
        nvidiaGTX.getVGACardInfo();

        myKomputer.getCPUInfo();
    }
}
