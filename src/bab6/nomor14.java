package bab6;

public class nomor14 {
    public static void main(String[] args){
        System.out.println(4*m(10000000));
    }
    public static double m(double n){
        double jumlah = 0;
        for(int i=1; i<=n;i++){
            double a = Math.pow(-1,i+1);
            double b = 2*i-1;
            jumlah+=a/b;
        }
        return jumlah;
    }
}
