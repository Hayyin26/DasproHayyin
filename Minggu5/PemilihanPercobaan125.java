package Minggu5;

import java.util.Scanner;

public class PemilihanPercobaan125 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input25.nextInt();

        // if (angka % 2 == 0)
        // System.out.println("Angka " + angka + " bilangan genap");
        // else
        // System.out.println("Angka " + angka + " bilangan ganjil");

        String output = angka % 2 == 0 ? "Angka " + angka + " bilangan genap" : "Angka " + angka + " bilangan ganjil";
        System.out.println(output);

        // int x = 100;
        // int y = x > 80 ? x++ : ++x;
        // System.out.println(y);

    }
}
