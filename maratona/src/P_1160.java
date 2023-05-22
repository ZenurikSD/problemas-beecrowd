package maratona;
import java.util.Scanner;

public class P_1160 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = 2;
        do{
            System.out.print("Quantos casos de teste? ");
            T = in.nextInt();
        } while (T < 1 || T > 30000);
        

        for (int i = 0; i < T; i++){
            int PA = 0, PB = 0;
            float G1 = 0, G2 = 0;

            do {
                System.out.print("População A: ");
                PA = in.nextInt(); 

                System.out.print("População B: ");
                PB = in.nextInt(); 

                System.out.print("Crescimento A %: ");
                G1 = in.nextFloat(); 

                System.out.print("Crescimento B %: ");
                G2 = in.nextFloat();  

            } while (
                (PA < 100 || PA >= 1000000) && (PB >= PA || PB > 1000000) &&
                (G1 < 0.1) || (G1 > 10.0) || (G2 < 0.0 || G2 > 10.0)
            );

                int anos = 0;
                while (PA <= PB && PB >= PA){
                    PA = Math.round(PA * G1);
                    PB = Math.round(PB * G2);

                    anos++;
                }

                if (anos > 100){
                    System.out.println("Mais de 1 seculo.");
                } else {
                    System.out.printf("%d anos.", anos);
                }           
        }


        in.close();

    }
}
