public class Fungsi {
    public static void main(String[] args) {
        int n = 10; // Jumlah angka Fibonacci yang akan ditampilkan

        System.out.println("Deret Fibonacci menggunakan Perulangan:");
        printFibonacciLoop(n);

        System.out.println("\nDeret Fibonacci menggunakan Fungsi Rekursif:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
    }

    // Fungsi untuk menampilkan deret Fibonacci dengan perulangan
    public static void printFibonacciLoop(int n) {
        int angkaSebelumSebelumnya = 0, angkaSebelumnya = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(angkaSebelumSebelumnya + " ");
            int angkaSaatIni = angkaSebelumSebelumnya + angkaSebelumnya;
            angkaSebelumSebelumnya = angkaSebelumnya;
            angkaSebelumnya = angkaSaatIni;
        }
    }

    // Fungsi rekursif untuk menghitung angka Fibonacci ke-n
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
