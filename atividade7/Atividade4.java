package atividade7;
import java.util.Scanner;

public class Atividade4 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	      
	        System.out.println("Digite três valores diferentes:");
	        int valor1 = scanner.nextInt();
	        int valor2 = scanner.nextInt();
	        int valor3 = scanner.nextInt();
	        

	        int menor, meio, maior;
	        if (valor1 < valor2 && valor1 < valor3) {
	            menor = valor1;
	            meio = Math.min(valor2, valor3);
	            maior = Math.max(valor2, valor3);
	        } else if (valor2 < valor1 && valor2 < valor3) {
	            menor = valor2;
	            meio = Math.min(valor1, valor3);
	            maior = Math.max(valor1, valor3);
	        } else {
	            menor = valor3;
	            meio = Math.min(valor1, valor2);
	            maior = Math.max(valor1, valor2);
	        }
	        

	        System.out.println("Os valores em ordem crescente são: " + menor + ", " + meio + ", " + maior);
	        
	        scanner.close();
	    }
	}

