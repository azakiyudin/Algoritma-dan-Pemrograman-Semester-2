package bab6;

public class nomor10 {
    public static void main(String[] args){

        int n=10000;
        int jumlah = 0;
        for(int i=2; i<=n;i++){
            if(isPrime(i)){
               jumlah+=1;
            }
        }
        System.out.println(jumlah);
    }
    public static boolean isPrime(int n){
        for(int bagi=2; bagi*bagi<=n;bagi++){
            if(n%bagi == 0){
                return false;
            }
        }
        return true;
    }
}
