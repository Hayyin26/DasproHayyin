import java.util.Scanner;

public class Latihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r1, r2, r3, r4, I;
        double v;

        System.out.print("Masukkan r1 : ");
        r1 = sc.nextInt();
        System.out.print("Masukkan r2 : ");

        r2 = sc.nextInt();
        System.out.print("Masukkan r3 : ");
        r3 = sc.nextInt();
        System.out.print("Masukkan r4 : ");
        r4 = sc.nextInt();

        double rp = 1 / (1 / r1 + 1 / r2 + 1 / r3);
        System.out.println("Rangkaian Paralel : " + rp);

        System.out.print("Masukkan I : ");
        I = sc.nextInt();

        v = I * (rp + r4);
        System.out.println("V : " + v);

    }

}
