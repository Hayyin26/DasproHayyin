package Minggu9;

import java.util.Scanner;

public class ArrayNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] NilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            NilaiAkhir[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai Akhir ke-" + i + " adalah " + NilaiAkhir[i]);
        }

    }
}
