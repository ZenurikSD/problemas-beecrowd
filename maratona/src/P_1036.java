package maratona;
import java.util.Scanner;

public class P_1036 {
    public static void main(String[] args) {
        
		double A, B, C, Delta, X1, X2;
		
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o valor A: ");
        A = sc.nextDouble();
        System.out.println("Digite o valor B: ");
        B = sc.nextDouble();
        System.out.println("Digite o valor C: ");
        C = sc.nextDouble();

        Delta = (Math.pow(B,2)) - 4 * A * C;

        if(Delta >= 0){
			X1 = ((-(B) + Math.sqrt(Delta) ) / 2 * A);
				System.out.println("R1: " + X1);
			X2 = ((-(B) - Math.sqrt(Delta)) / 2 * A);
				System.out.println("R2:" + X2);
        }else{
            System.out.println("Impossivel calcular");
        }

		sc.close();
	}
}
