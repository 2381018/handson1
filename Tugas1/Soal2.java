public class Soal2 {
    public static void main(String[] args) {
        // Inisialisasi array
        int[] ar = {1, 2, 3};

        // Variabel untuk menyimpan jumlah
        int sum = 0;

        // Menggunakan for-loop untuk menghitung jumlah elemen array
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }

        // Menampilkan hasil
        System.out.println("Jumlah elemen array: " + sum);
    }
}
