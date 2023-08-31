public class Perulangan {
    public static void main(String[] args) {

        // 2 Angka terakhir pada NIM yaitu 31
        int n = 31;

        if (n < 10) {
            n += 10;
        }

        String[] hari = { "senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu" };

        int indexHari = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(hari[indexHari] + " ");
            indexHari++;
            if (indexHari == 7) {
                indexHari = 0;
            }
        }
    }
}
