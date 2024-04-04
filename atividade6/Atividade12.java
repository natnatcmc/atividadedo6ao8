package atividade6;

import java.util.Scanner;

public class Atividade12 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite o nome: ");
	        String nome = scanner.nextLine();
	        
	        System.out.println("Digite o sexo (M/F): ");
	        char sexo = scanner.next().charAt(0);
	        
	        if (sexo == 'M' || sexo == 'm') {
	            System.out.println("Ilmo Sr. " + nome);
	        } else if (sexo == 'F' || sexo == 'f') {
	            System.out.println("Ilma Sra. " + nome);
	        } else {
	            System.out.println("Sexo inválido.");
	        }
	        
	        scanner.close();
	    }
}
