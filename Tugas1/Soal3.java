package Tugas1;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata dalam format camelCase: ");
        String input = scanner.nextLine();

        // Variabel untuk menghitung jumlah kata
        int jumlahKata = 1; // Mulai dari 1 karena kata pertama selalu huruf kecil

        int i = 0; // Indeks untuk while-loop
        while (i < input.length()) {
            // Jika huruf adalah huruf besar, itu menunjukkan awal kata baru
            if (Character.isUpperCase(input.charAt(i))) {
                jumlahKata++;
            }
            i++;
        }

        // Menampilkan jumlah kata
        System.out.println("Jumlah kata dalam camelCase: " + jumlahKata);

        // Menutup scanner
        scanner.close();
    }
}

