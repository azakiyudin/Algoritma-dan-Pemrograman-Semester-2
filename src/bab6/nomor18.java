package bab6;

import java.util.Scanner;
public class nomor18 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan password: ");
        String pwd = input.next();
        cekpwd(pwd);
    }
    public static void cekpwd(String pwd){
        boolean valid = true;
        int panjang = pwd.length();
        int digit = 0;
        if (panjang >=8){
            valid = false;
        }
        for (int i=0; i<panjang;i++){
            int asc = pwd.charAt(i);
            if (asc>=48 & asc<=57){
                digit++;
            }
            if (asc<48 || asc>57 & asc<65 || asc>90 & asc<97 || asc>122){
                valid = false;
                break;
            }
        }
        if (digit<2){
            valid = false;
        }
        if (valid == true){
            System.out.println("Password valid");
        } else {
            System.out.println("Password tidak valid");
        }
    }
}