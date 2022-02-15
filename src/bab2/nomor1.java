package bab2;

import java.util.Scanner;
public class nomor1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan derajat dalam Celcius: ");
        double celc = input.nextDouble();
        double fahr = (9.0/5) * celc + 32;
        System.out.println(celc + " Celcius adalah " + fahr + " Fahrenheit");
    }
}