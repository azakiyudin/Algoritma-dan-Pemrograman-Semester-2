package bab6;

public class nomor26 {
    public static void main(String[] args) {

        int n=1;
        int i = 1;
        while (i <= 100000){
            if (isPrime(i)) {
                if(isPalindrom(i)){
                    if((n%10) != 0){
                        System.out.print(i + " ");
                    } else{
                        System.out.println(i);
                    }
                }
            }
            n++;
            i++;
        }
    }
    public static boolean isPrime(int n){
        for(int bagi=2; bagi*bagi<=n;bagi++){
            if(n%bagi == 0){
                return false;
            }
        }
        return true;
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
