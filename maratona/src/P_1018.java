package maratona;
import java.util.Scanner;

public class P_1018 {

	public static void main(String[] args) {
		
		int valor = 0;
		  	
		Scanner sc = new Scanner(System.in);
		
        do{
            System.out.println("Insira um VALOR: ");
            valor = sc.nextInt();
        }
        while (valor <= 0 || valor >= 1000000);
        

        float notas[] = {100, 50, 20, 10, 5, 2, 1};
        int nota = 0;
		for (int i = 0; i < notas.length; i++)
        {
            nota = Math.round(valor / notas[i]);
            valor = (valor - nota);

            System.out.printf(
                "%i nota(s) de R$ %f:.2f",
                valor, notas[i]
                );
        }

        
		// int notas100 = valor/100;
		// valor = (valor - notas100) * 100;
		
		// int notas50 = valor/50;
		// valor = (valor - notas50) * 100;
		
		// int notas20 = valor/20;
		// valor = (valor - notas20) * 10;
		
		// int notas10 = valor/10;
		// valor %= 10;
				
		// int notas5 = valor/5;
		// valor %= 5;
		
		// int notas1 = valor;
		
		// System.out.println("Notas de 100: " + notas100);
		// System.out.println("Notas de 50: " + notas50);
		// System.out.println("Notas de 20: " + notas20);
		// System.out.println("Notas de 10: " + notas10);
		// System.out.println("Notas de 5: " + notas5);
		// System.out.println("Notas de 1: " + notas1);
		
        sc.close();
	}
}