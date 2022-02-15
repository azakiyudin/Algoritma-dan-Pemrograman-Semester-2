package eas;

public class ABCD20201 {
    public static void main(String[] args){

        System.out.println("desimal\t\tbinari");
        for (int i=1;i<=20;i++){
            System.out.print(i + "\t\t\t");
            fr(i);
            System.out.println();
        }
    }
    public static void fr(int n){
        if(n>0){
            fr(n/2);
            System.out.print(n%2);
        }
    }
}
