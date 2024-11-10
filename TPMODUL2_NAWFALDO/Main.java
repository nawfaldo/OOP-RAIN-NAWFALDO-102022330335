package TPMODUL2_NAWFALDO;

public class Main {
    public static void main(String[] args) {
        System.out.println("Detail Hewan");

        Kucing kucing = new Kucing("Momo", 2, "Persia");
        System.out.println("\nIni adalah Momo");
        kucing.suara();
        kucing.makan();
        kucing.makan("ikan");

        Burung burung = new Burung("Rio", 2, "Hijau");
        System.out.println("\nIni adalah Rio");
        burung.suara();
        burung.makan();
        burung.makan("biji-bijian");

        System.out.println();
        kucing.infoHewan();
        burung.infoHewan();
    }
}
