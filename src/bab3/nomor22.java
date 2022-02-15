package bab3;

import java.util.Scanner;
public class nomor22 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan koordinat ttiknya: ");
        int x = input.nextInt();
        int y = input.nextInt();

        double d = Math.sqrt(x*x+y*y);
        if(d<=10){
            System.out.printf("Titik (%s,%s) berada di dalam lingkaran",x,y);
        } else {
            System.out.printf("Titik (%s,%s) berada di luar lingkaran",x,y);
        }
    }
}
