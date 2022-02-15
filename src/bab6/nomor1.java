package bab6;

public class nomor1 {
    public static void main(String[] args){

       for (int i=1; i<=100; i++){
           if (i%10 != 0){
               System.out.print(pentagon(i) + "\t");
           } else {
               System.out.println(pentagon(i));
           }
       }
    }

    public static int pentagon(int n){
        int pen = n*(3*n-1)/2;
        return pen;
    }
}
