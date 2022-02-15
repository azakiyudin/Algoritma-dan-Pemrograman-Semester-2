package bab3;

import java.util.*;
public class nomor19 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if((a+b)>c){
            if((a+c)>b){
                if((b+c)>a){
                    double keliling = a+b+c;
                    System.out.printf("Panjang sisi segitiga tersebut adalah %f,%f,%f dan kelilingnya adalah %f",a,b,c,keliling);
                } else {
                    System.out.println("Bukan panjang sisi suatu segitiga");
                }
            } else {
                System.out.println("Bukan panjang sisi suatu segitiga");
            }
        } else {
            System.out.println("Bukan panjang sisi suatu segitiga");
        }
    }
}
