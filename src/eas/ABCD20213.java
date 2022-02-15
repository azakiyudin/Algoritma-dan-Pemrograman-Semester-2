package eas;

public class ABCD20213 {
    public static void main(String[] args){
        System.out.println(format(12,3));
    }
    public static String format(int bilangan, int p){
        int n=bilangan;
        int digit=0;
        while(n>0){
            n=n/10;
            digit++;
        }
        String a=Integer.toString(bilangan);
        if (p<=digit){
            return a;
        } else {
            return 0 + format(bilangan,p-1);
        }
    }
}
