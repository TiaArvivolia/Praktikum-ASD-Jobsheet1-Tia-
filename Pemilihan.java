import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner inputPemilihan = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = inputPemilihan.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = inputPemilihan.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = inputPemilihan.nextDouble();

        System.out.println("==============================");
        System.out.println("==============================");

        // Menghitung nilai akhir
        double nilaiAkhir = 0.2 * nilaiTugas + 0.35 * nilaiUTS + 0.45 * nilaiUAS;

        System.out.println("Nilai Akhir: " + nilaiAkhir);

        // Bentuk nilai huruf
        String nilaiHuruf;
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("==============================");

        // Keterangan
        String keterangan;
        if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
            keterangan = "TIDAK LULUS";
        } else {
            keterangan = "LULUS";
        }
        System.out.println("Keterangan: " + keterangan);
    }
}
