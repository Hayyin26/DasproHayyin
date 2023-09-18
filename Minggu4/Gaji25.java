package Minggu4;

import java.util.Scanner;

public class Gaji25 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk, TotGaji;
        int gaji = 40000, PotGaji = 25000;

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda");
        jmlTdkMasuk = input.nextInt();

        TotGaji = (jmlMasuk * gaji) - (jmlTdkMasuk * PotGaji);

        System.out.println("Gaji yang anda terima adalah " + TotGaji);
    }
}
