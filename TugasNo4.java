import java.util.Scanner;

public class TugasNo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Program Hitung Luas ===");
            System.out.println("1. Luas Segitiga");
            System.out.println("2. Luas Persegi Panjang");
            System.out.println("3. Luas Lingkaran");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
                hitungLuasSegitiga();
            } else if (pilihan == 2) {
                hitungLuasPersegiPanjang();
            } else if (pilihan == 3) {
                hitungLuasLingkaran();
            } else if (pilihan == 4) {
                System.out.println("Selesai!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, 3, atau 4.");
            }
        }
    }

    public static void hitungLuasSegitiga() {
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        double alas = scanner1.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = scanner1.nextDouble();

        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga: " + luas);
    }

    public static void hitungLuasPersegiPanjang() {
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = scanner2.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner2.nextDouble();

        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang: " + luas);
    }

    public static void hitungLuasLingkaran() {
        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner3.nextDouble();

        double luas = 3.14 * jariJari * jariJari;
        System.out.println("Luas lingkaran: " + luas);
    }
}
