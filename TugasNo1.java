public class TugasNo1 {
    public static void main(String[] args) {
        // Data customer dan berat pakaian
        String[] customers = { "Ani", "Budi", "Bina", "Cita" };
        int[] beratPakaian = { 4, 15, 6, 11 };

        // Tarif per kg dan diskon
        double tarifPerKg = 4500;
        double diskon = 0.05;

        double totalPendapatan = 0;

        System.out.println("==== SMILE LAUNDRY ====");
        System.out.println(" ");

        for (int i = 0; i < customers.length; i++) {
            double biaya = beratPakaian[i] * tarifPerKg;

            // Berikan diskon jika berat pakaian > 10 kg
            if (beratPakaian[i] > 10) {
                biaya -= biaya * diskon;
            }

            totalPendapatan += biaya;

            System.out.println("Customer: " + customers[i]);
            System.out.println("Berat Pakaian: " + beratPakaian[i] + " kg");
            System.out.println("Biaya: Rp. " + biaya);
            System.out.println();
        }

        System.out.println("=========================");

        System.out.println("Total Pendapatan Smile Laundry: Rp. " + totalPendapatan);
    }
}
