import java.util.Scanner;

public class Problema3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número de termos da sequência: ");
		int sequenciaTermo = sc.nextInt();

		System.out.println("Sequência de Fibonacci: ");
		for (int i = 0; i < sequenciaTermo; i++) {
			System.out.println(calcularFibonacci(i) + " ");
		}
	}

	public static int calcularFibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return calcularFibonacci(n) + calcularFibonacci(n - 1);
		}
	}
}