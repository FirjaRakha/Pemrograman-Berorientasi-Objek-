import java.text.NumberFormat;
import java.util.Locale;

public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }

    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public class HardDisk {
        int sizeGB;
        String brand;

        HardDisk(int sizeGB, String brand) {
            this.sizeGB = sizeGB;
            this.brand = brand;
        }

        public void getHardDiskInfo() {
            System.out.println("Ukuran HardDisk: " + this.sizeGB + " GB");
            System.out.println("Merek HardDisk: " + this.brand);
        }
    }

    public class Motherboard {
        String formFactor;
        String brand;

        Motherboard(String formFactor, String brand) {
            this.formFactor = formFactor;
            this.brand = brand;
        }

        public void getMotherboardInfo() {
            System.out.println("Form Factor Motherboard: " + this.formFactor);
            System.out.println("Merek Motherboard: " + this.brand);
        }
    }

    public class PowerSupply {
        int wattage;
        String brand;

        PowerSupply(int wattage, String brand) {
            this.wattage = wattage;
            this.brand = brand;
        }

        public void getPowerSupplyInfo() {
            System.out.println("Daya Power Supply: " + this.wattage + " Watt");
            System.out.println("Merek Power Supply: " + this.brand);
        }
    }

    public class VGACard {
        String manufacturer;
        String model;

        VGACard(String manufacturer, String model) {
            this.manufacturer = manufacturer;
            this.model = model;
        }

        public void getVGACardInfo() {
            System.out.println("Pabrik VGA Card: " + this.manufacturer);
            System.out.println("Model VGA Card: " + this.model);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }
}
