package atividade8;
import java.util.Scanner;

public class Exercicio9 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int soma = 0;
	        
	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o " + i + "º valor: ");
	            int valor = scanner.nextInt();
	            soma += valor;
	        }
	        
	        double media = (double) soma / 10;
	        
	        System.out.println("Total do somatório: " + soma);
	        System.out.println("Média aritmética: " + media);
	        
	        scanner.close();
	    }
}
