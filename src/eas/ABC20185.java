package eas;

public class ABC20185 {
    public static void main(String[] args){

        System.out.println("i\t\t\tm(i)");
        System.out.println("----------------");
        for (int i=1;i<=20;i++){
            System.out.println("i\t\t\t" + hitungDeret(i));
        }

    }

    public static double hitungDeret(int i){
        double sum=0;
        for(int j=i;j>=1;j--){
            double b=j+1;
            sum+= j/b;
        }
        return sum;
    }
}
