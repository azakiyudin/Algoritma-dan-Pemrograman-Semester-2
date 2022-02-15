package bab5;

import java.util.*;
public class nomor16 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();
        int i = 2;
        while (n != i){
            int b = n%i;
            if (b == 0){
                System.out.print(i + ", ");
                n = n/i;
            } else{
                i++;
            }
        }
        System.out.print(n + ".");
    }
}
