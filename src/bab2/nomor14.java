package bab2;

import java.util.Scanner;
public class nomor14 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat dalam pon: ");
        double pon = input.nextDouble();
        System.out.print("Masukkan tinggi dalam inci: ");
        double inci = input.nextDouble();

        double kg = 0.45359327 * pon;
        double m = 0.0254 * inci;
        double bmi = kg / (m * m);
        System.out.println("Nilai BMI adalah " + bmi);
    }
}
