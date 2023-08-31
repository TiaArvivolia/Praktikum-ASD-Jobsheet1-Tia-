public class Array {
    public static void main(String[] args) {
        int[][] stok = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };

        int[] harga = { 75000, 50000, 60000, 10000 };
        int[] penguranganStok = { -1, -2, 0, -5 }; // Pengurangan stok di RoyalGarden 1

        // A. Hitung Jumlah stok berdasarkan jenis bunganya di seluruh Cabang
        int[] totStokPerBunga = new int[4];
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                totStokPerBunga[j] += stok[i][j];
            }
        }

        System.out.println("Total stok per Bunga di Seluruh Cabang:");
        System.out.println("===========================================");
        System.out.println("Aglonema: " + totStokPerBunga[0]);
        System.out.println("Keladi: " + totStokPerBunga[1]);
        System.out.println("Alocasia: " + totStokPerBunga[2]);
        System.out.println("Mawar: " + totStokPerBunga[3]);

        // B. Hitung total pendapatan dari RoyalGarden 1 jika semua Bunga Terjual Habis
        int totPendapatan = 0;
        for (int i = 0; i < totStokPerBunga.length; i++) {
            totStokPerBunga[i] += penguranganStok[i];
            totPendapatan += totStokPerBunga[i] * harga[i];
        }

        System.out.println("===========================================");
        System.out.println("Total Pendapatan dari RoyalGarden 1 jika Semua Bunga Terjual Habis: " + totPendapatan);
        System.out.println("===========================================");
    }
}
