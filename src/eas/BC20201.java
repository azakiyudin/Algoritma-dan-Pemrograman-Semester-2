package eas;

import java.util.Scanner;

public class BC20201 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int min = input.nextInt();
        int max = input.nextInt();
        System.out.println(jumKubik2(min,max));
    }
    public static long jumKubik2(long min, long max){
        long sum=0;
        if (max>=min) {
            for (long i = min; i <= max; i++) {
                sum += i * i * i;
            }
        }
        return sum;
    }
}
