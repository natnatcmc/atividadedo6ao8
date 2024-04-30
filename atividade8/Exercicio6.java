package atividade8;
import java.util.Scanner;

public class Exercicio6 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o valor da base: ");
	        double base = scanner.nextDouble();
	        
	        System.out.print("Digite o valor do expoente: ");
	        int expoente = scanner.nextInt();
	        
	        double resultado = 1;
	        
	        for (int i = 0; i < Math.abs(expoente); i++) {
	            resultado *= base;
	        }
	        
	        if (expoente < 0) {
	            resultado = 1 / resultado;
	        }
	        
	        System.out.println("Resultado: " + resultado);
	        
	        scanner.close();
	    }
}
