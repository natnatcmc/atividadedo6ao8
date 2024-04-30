package atividade7;
import java.util.Scanner;

public class Atividade3 {
	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Ler os três valores
	        System.out.println("Digite três valores diferentes:");
	        int valor1 = scanner.nextInt();
	        int valor2 = scanner.nextInt();
	        int valor3 = scanner.nextInt();
	        
	        // Calcular a soma dos dois maiores valores
	        int somaDosMaiores;
	        if (valor1 > valor2 && valor1 > valor3) {
	            somaDosMaiores = valor1 + Math.max(valor2, valor3);
	        } else if (valor2 > valor1 && valor2 > valor3) {
	            somaDosMaiores = valor2 + Math.max(valor1, valor3);
	        } else {
	            somaDosMaiores = valor3 + Math.max(valor1, valor2);
	        }
	        
	        // Escrever a soma dos dois maiores valores
	        System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);
	        
	        scanner.close();
	    }
	}
}
