package bab6;

public class nomor6 {
    public static void main(String[] args){

        display2(5);

    }
    public static void display2(int n){
        for(int i=1;i<=n;i++) {
            for (int j = n; j >= 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(kombin(i, j) + " ");
                }
            }
            System.out.println();
        }
    }
    /*public static void display(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if (j>i) {
                    System.out.print(" ");
                } else{
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }*/
    public static int faktor(int n){
        int hasil = 1;
        for (int i=1;i<=n;i++){
            hasil*=i;
        }
        return hasil;
    }
    public static int kombin(int n, int m){
        int c = n-m;
        int a = faktor(n);
        int b1 = faktor(m);
        int b2 = faktor(c);
        int kombinnya = a/(b1*b2);

        return kombinnya;
    }
}
