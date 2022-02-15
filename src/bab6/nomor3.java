package bab6;
import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n=input.nextInt();
        boolean hasil = isPalindrom(n);
        System.out.println(hasil);

    }
    public static int reverse(int n){
        int nbaru=0;
        while(n>0){
            int a = n%10;
            nbaru = 10*nbaru+a;
            n=n/10;
        }
        return nbaru;
    }
    public static boolean isPalindrom(int n){
        int nbaru = reverse(n);
        boolean cek = false;
        if (n == nbaru){
            cek = true;
        }
        return cek;
    }
}
