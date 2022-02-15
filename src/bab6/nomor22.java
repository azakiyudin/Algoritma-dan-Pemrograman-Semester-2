package bab6;

public class nomor22 {
    public static void main(String[] args){

        System.out.println("Hasil aproksimasi akar");
        for(int i=1;i<=10; i++){
            System.out.println("akar(" + i + ") = " + sqrt(i));
        }
    }
    public static double sqrt(long n){
        double tebak = 100;
        int i = 1;
        while(i<=100){
            tebak = (tebak + n/tebak)/2;
            i++;
        }
        return tebak;
    }
}
