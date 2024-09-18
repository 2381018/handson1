package Tugas1;

public class Soal1 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3};

        int sum = 0;

        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }

        System.out.println("Jumlah elemen array: " + sum);
    }
}
