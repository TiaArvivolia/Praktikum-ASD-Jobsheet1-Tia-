import java.util.Scanner;

public class TugasNo3 {
    public static void main(String[] args) {
        Scanner inputBilangan = new Scanner(System.in);
        
        System.out.print("Masukkan n: ");
        int n = inputBilangan.nextInt();
        
        System.out.print("Keluaran: ");
        int hitung = 0;
        int bilanganSaatIni = 2;
        while (hitung < n) {
            if (bilanganSaatIni % 4 != 0) {
                System.out.print(bilanganSaatIni + " ");
                hitung++;
            }
            bilanganSaatIni += 2;
        }
    }
}
