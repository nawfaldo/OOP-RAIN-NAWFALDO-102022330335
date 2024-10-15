// Don't delete any comments below!!!
// Todo: Import Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Todo : Create ManajemenInventaris Object and Scanner
        ManajemenInventaris manajemenInventaris = new ManajemenInventaris();

        Scanner scanner = new Scanner(System.in);

        // Todo : Create Loop list menu
        while (true) {
            System.out.println("===== Menu Inventaris Makanan EAD =====");
            System.out.println("1. Tambah Makanan Kering");
            System.out.println("2. Tambah Makanan Basah");
            System.out.println("3. Tampilkan Semua Makanan");
            System.out.println("4. Exit");

            System.out.println("Pilih menu: ");
            int pilihanMenu = scanner.nextInt();

            switch (pilihanMenu) {
                case 1:
                    manajemenInventaris.tambahMakananKering();
                    System.out.println();
                    break;
                case 2:
                    manajemenInventaris.tambahMakananBasah();
                    System.out.println();
                    break;
                case 3:
                    manajemenInventaris.tampilkanSemuaMakanan();
                    System.out.println();
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        }
    }
}
