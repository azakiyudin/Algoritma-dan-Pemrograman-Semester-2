package bab2;

import java.util.Scanner;
public class nomor16 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi: ");
        double s = input.nextDouble();

        double luas = (3.0/2) * Math.sqrt(3) * (s*s);
        System.out.println("Luas dari segienam adalah " + luas);
    }
}
