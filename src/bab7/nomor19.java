package bab7;

import java.util.Scanner;
public class nomor19 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int n = input.nextInt();
        int[] list = new int[n];
        for (int i=0;i<n;i++){
            list[i] = input.nextInt();
        }
        boolean p = isSorted(list);
        if(p == false){
            System.out.println("The list is not sorted");
        } else {
            System.out.println("The list is already sorted");
        }
    }
    public static boolean isSorted(int [] list){
        for(int i=0; i+1<list.length;i++){
            if(list[i]>list[i+1]){
                return false;
            }
        }
        return true;
    }
}
