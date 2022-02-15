package eas;

public class BC20203 {
    public static void main(String[] args){

        HitungMundur(10);
    }
    public static void HitungMundur(int n){
        if(n==0){
            System.out.print("BLUM");
        } else{
            System.out.print(n + ", ");
            HitungMundur(n-1);
        }
    }
}
