package Minggu5;

import java.util.Scanner;

public class PemilihanPercobaan225 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float uas = input25.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input25.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input25.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input25.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        // String message = total < 65 ? "Remidi" : "Tidak remidi";
        // System.out.println("Nilai akhir = " + " Sehingga " + message);

        if (total > 80 && total <= 100) {
            System.out.println("Mendapatkan nilai huruf = A yang setara dengan nilai 4 dan berkualitas Sangat Baik");
        } else if (total > 73 && total <= 80) {
            System.out.println(
                    "Mendapatkan nilai huruf = B+ yang setara dengan nilai 3.5 dan berkualitas Lebih dari Baik");
        } else if (total > 65 && total <= 73) {
            System.out.println("Mendapatkan nilai huruf = B yang setara dengan nilai 3 dan berkualitas Baik");
        } else if (total > 60 && total <= 65) {
            System.out.println(
                    "Mendapatkan nilai huruf = C+ yang setara dengan nilai 2.5 dan berkualiatas Lebih dari Cukup");
        } else if (total > 50 && total <= 60) {
            System.out.println("Mendapatkan nilai huruf = C yang setara dengan nilai 2 dan berkualitas Cukup");
        } else if (total > 39 && total <= 50) {
            System.out.println("Mendapatkan nilai huruf = D yang setara dengan nilai 1.5 dan berkualitas Kurang");
        } else if (total > 39 && total <= 39) {
            System.out.println("Mendapatkan nilai huruf = E yang setara dengan nilai 1 dan berkualitas Gagal");
        }

    }
}
