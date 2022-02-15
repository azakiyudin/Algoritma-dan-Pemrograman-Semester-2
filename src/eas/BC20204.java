package eas;

import java.util.Scanner;

public class BC20204 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Ukuran matriks = ");
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] matriks = new int[m][n];
        for(int i=0;i<matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                matriks[i][j] = input.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                sum+=matriks[i][j];
            }
        }
        System.out.println("Jumlah semua entrinya adalah " + sum);
    }
}
