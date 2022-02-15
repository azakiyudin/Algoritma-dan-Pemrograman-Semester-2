package eas;

import java.util.Scanner;

public class ABC20183 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[][] matriks = new int[3][4];
        for(int i=0;i<matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                matriks[i][j] = input.nextInt();
            }
        }
        int j=0;
        while(j<4){
            int sum=0;
            int i=0;
            while(i<3){
                sum+=matriks[i][j];
                i++;
            }
            System.out.println("Jumlah untuk kolom ke-" + (j+1) + " = " + sum);
            j++;
        }
    }
}
