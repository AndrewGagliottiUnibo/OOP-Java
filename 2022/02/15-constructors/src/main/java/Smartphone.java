package src.main.java;

class Smartphone {

    int nCPU;
    int ram;
    int sdSize;
    String brand;
    String model;
    boolean hasGPS;
    boolean has3G;
    boolean hasNFC;

    static final boolean DEF_HAS_GPS = true;
    static final boolean DEF_HAS_3G = true;
    static final boolean DEF_HAS_NFC = true;
    static final int DEF_SD_SIZE = 8192;
    static final int DEF_RAM_SIZE = 1024;
    static final int DEF_N_CPU = 2;

    /**
     * Constructor.
     * 
     * @param nCPU
     * @param ram
     * @param sdSize
     * @param brand
     * @param model
     * @param hasGPS
     * @param has3G
     * @param hasNFC
     */
    public Smartphone(final int nCPU, final int ram, final int sdSize, final String brand, final String model,
            final boolean hasGPS, final boolean has3G, final boolean hasNFC) {
        this.nCPU = nCPU;
        this.ram = ram;
        this.sdSize = sdSize;
        this.brand = brand;
        this.model = model;
        this.hasGPS = hasGPS;
        this.has3G = has3G;
        this.hasNFC = hasNFC;
    }

    /**
     * Overload brand and model.
     * 
     * @param brand
     * @param model
     */
    public Smartphone(final String brand, final String model) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, DEF_HAS_GPS, DEF_HAS_3G, DEF_HAS_NFC);
    }

    /**
     * Overload brand, model, gps and 3g.
     * 
     * @param brand
     * @param model
     * @param hasGPS
     * @param has3g
     */
    public Smartphone(String brand, String model, boolean hasGPS, boolean has3g) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, hasGPS, has3g, DEF_HAS_NFC);
    }

    /**
     * Overload brand, model, sdSize.
     * 
     * @param brand
     * @param model
     * @param sdSize
     */
    public Smartphone(String brand, String model, int sdSize) {
        this(DEF_N_CPU, DEF_RAM_SIZE, sdSize, brand, model, DEF_HAS_GPS, DEF_HAS_3G, DEF_HAS_NFC);
    }

    /**
     * Overload brand, model e nfc.
     * 
     * @param brand
     * @param model
     * @param hasNFC
     */
    public Smartphone(String brand, String model, boolean hasNFC) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, DEF_HAS_GPS, DEF_HAS_3G, hasNFC);
    }

    void printStringRep() {
        System.out.println("Smartphone info:");
        System.out.println("n CPU(s): " + this.nCPU);
        System.out.println("RAM amount: " + this.ram);
        System.out.println("SD size: " + this.sdSize);
        System.out.println("brand: " + this.brand);
        System.out.println("model: " + this.model);
        System.out.println("hasGPS: " + this.hasGPS);
        System.out.println("has3G: " + this.has3G);
        System.out.println("hasNFC: " + this.hasNFC + "\n");
    }

    public static void main(final String[] args) {
        // 1) Creare lo smarthpone HTC One sdSize:1024
        Smartphone smart1 = new Smartphone("HTC", "ONE", 1024);

        // 2) Creare lo smarthpone Samsung Galaxy Note 3 ram:2048 cpu:4
        // sdSize:8192 gps:true nfc:true 3g:true
        Smartphone smart2 = new Smartphone(4, 2048, 1024, "Samsung", "Galaxy Note 3", true, true, true);

        // 3) Creare lo smarthpone Apple iPhone 5S nfc:false
        Smartphone smart3 = new Smartphone("Apple", "Iphone 5s", false);

        // 4) Creare lo smarthpone Google Nexus 4 gps:true 3g:true
        Smartphone smart4 = new Smartphone("Google", "Nexus", true, true);

        // 5) Utilizzare il metodo printStringRep per stampare in standard
        // output le informazioni di ciascun telefono
        smart1.printStringRep();
        smart2.printStringRep();
        smart3.printStringRep();
        smart4.printStringRep();
    }
}
