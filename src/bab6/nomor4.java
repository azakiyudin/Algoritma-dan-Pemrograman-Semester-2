package bab6;
import java.util.Scanner;

public class nomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = input.nextInt();
        reverse(n);

    }

    public static void reverse(int n) {
        int nbaru = 0;
        while (n > 0) {
            int a = n % 10;
            nbaru = 10 * nbaru + a;
            n = n / 10;
        }
        System.out.println(nbaru);
    }
}