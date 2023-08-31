public class TugasNo2 {
    public static void main(String[] args) {
        double saldoAwal = 1000000; // Saldo awal 1 juta rupiah
        double saldoTarget = 1500000; // Saldo target 1,5 juta rupiah
        double bungaBulanan = 0.02;
        int bulan = 0;

        while (saldoAwal < saldoTarget) {
            saldoAwal += saldoAwal * bungaBulanan; // Tambah saldo dengan bunga bulanan
            bulan++;
        }

        System.out.println("Saldo mencapai 1.5 juta rupiah pada bulan ke-" + bulan);
    }
}
