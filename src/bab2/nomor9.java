package bab2;

import java.util.*;
public class nomor9 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan vo, v1, dan t: ");
        double vo = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double a = (v1 - vo) / t;
        System.out.println("percepatan rata-ratanya adalah " + a);
    }
}
