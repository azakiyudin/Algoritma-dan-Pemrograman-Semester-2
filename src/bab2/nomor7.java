package bab2;

import java.util.*;
public class nomor7 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka dalam menit: ");
        int menit = input.nextInt();
        int tahun = menit / (60 * 24 * 365);
        int sisamenit = menit % (60 * 24 * 365);
        int hari = sisamenit / (60 * 24);
        System.out.println(menit + " menit itu sekitar " + tahun + " tahun dan " + hari + " hari");
    }
}
