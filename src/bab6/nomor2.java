package bab6;

public class nomor2 {
    public static void main(String[] args){

        System.out.println(sumdig(1315));
    }
    public static int sumdig(long n){
        int jumlah=0;
        while(n>0){
            long a = n%10;
            n=n/10;
            jumlah += (int)a;
        }
        return jumlah;
    }
}
