package atividade7;
import java.util.Scanner;

public class Atividade7 {
	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite o primeiro valor:");
	        int valor1 = scanner.nextInt();
	        
	        System.out.println("Digite o segundo valor:");
	        int valor2 = scanner.nextInt();
	        
	        if (valor1 == valor2) {
	            System.out.println("Números iguais");
	        } 
	        else if (valor1 > valor2) {
	            System.out.println("Primeiro é maior");
	        } 
	        else {
	            System.out.println("Segundo é maior");
	        }
	        
	        scanner.close();
	    }
	}

