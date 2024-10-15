// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();
    ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void tambahMakananKering() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jumlah: ");
        int jumlah = scanner.nextInt();

        System.out.print("Masukkan Harga: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Masukkan Brand: ");
        String brand = scanner.nextLine();

        // Todo : Create a new object for MakananKering
        daftarMakananKering.add(
            new MakananKering(
                nama,
                jumlah,
                harga,
                brand
            )
        );
        
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.print("Makanan kering berhasil ditambahkan");
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jumlah: ");
        int jumlah = scanner.nextInt();

        System.out.print("Masukkan Harga: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Masukkan Brand: ");
        String brand = scanner.nextLine();

        // Todo : Create a new object for MakananKering
        daftarMakananBasah.add(
            new MakananBasah(
                nama,
                jumlah,
                harga,
                brand
            )
        );
        
        // Todo : Create Print Notifitaction "Makanan basah berhasil ditambahkan"
        System.out.print("Makanan basah berhasil ditambahkan");
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
            System.out.print("Tidak ada makanan disini");
        } else {
            // Todo : Create print notification for Makanan Kering  
            for (MakananKering makananKering : daftarMakananKering) {
                makananKering.tampilkanData();
                System.out.println();
            }
            // Todo : Create print notification for  Makanan Basah
            for (MakananBasah makananBasah : daftarMakananBasah) {
                makananBasah.tampilkanData();
                System.out.println();
            }
        }
    }
}
