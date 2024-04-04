package atividade6;

	import java.util.Scanner;
	/**1) Ler dois valores numéricos
	 *  inteiros e apresentar o resultado
	 *  da diferença do maior pelo menor valor.
	 */

	public class Atividade1 {
		public static void main (String[]args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Informe o primeiro valor: ");
			int valor1 = sc.nextInt();
			
			System.out.println("Informe o segundo valor: ");
			int valor2 = sc.nextInt();
			int diferencaMaior1 = valor1 - valor2;
			int diferencaMaior2 = valor2 - valor1;
			
			if (valor1 > valor2) {
				System.out.println("O maior valor é: "+ valor1 + ", o menor é: " + valor2 + ". A diferença é: " + diferencaMaior1);
			} else {
				System.out.println("O maior valor é: "+ valor2 + ", o menor é: " + valor1 + ". A diferença é: " + diferencaMaior2);
			}
		}
	}


