package eas;

public class ABCD20212 {
    public static void main(String[] args){

        System.out.println(func(7));
    }
    public static int func(int n){
        if (n==0){
            return 1;
        } else{
            return func(n-1) + 3;
        }
    }
}
