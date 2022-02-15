import java.util.Scanner;

public class tes {
    /** Main method */
    public static void main(String[] args) {

        double[] nilai = {4,3.5,3,2.5,2};
        String[] nilai2 = {"A","AB","B","BC","C"};
        int banyak = 0;
        int total = 0;
        System.out.println("F\tM\tA1\tA2\tA3\tK");
        for(int i=0; i< 4;i++){
            for(int j=0; j< 4;j++){
                for(int k=0; k< 4;k++){
                    for(int l=0;l< 4;l++){
                        for(int m=0;m< 2;m++){
                            for(int n=2;n< nilai.length;n++){
                                total++;
                                double IP = (3*(nilai[n]+nilai[m])+2*(nilai[i]+nilai[j])+4*(nilai[k]+nilai[l]))/18;
                                double IP2 = (int)(IP*100)/100.0;
                                if(IP2 < 3){
                                    System.out.println(nilai2[n] + "\t" + nilai2[m] + "\t" + nilai2[l]
                                            + "\t" + nilai2[k] + "\t" + nilai2[j] + "\t" + nilai2[i]);
                                    System.out.println(IP2);
                                    banyak++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(banyak);
        System.out.println(total);
        double peluang = (double)banyak/total;
        System.out.println("peluang di bawah 3.0 adalah " + peluang);

    }
}
