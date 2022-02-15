package eas;

import java.util.Scanner;
public class A20204 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.println(n + "! = " + faktorial(n));
    }
    public static long faktorial(long n){
        if (n==1) {
            return 1;
        } else{
            return n*faktorial(n-1);
        }
    }
}
