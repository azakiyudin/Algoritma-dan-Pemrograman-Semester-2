package bab5;

public class nomor10 {
    public static void main(String[] args){

        int i=1;
        for (int a = 120; a <= 1000; a += 30) {
            if (i%10 == 0) {
                System.out.println(a);
            } else {
                System.out.print(a + " ");
            }
            i++;
        }
    }
}
