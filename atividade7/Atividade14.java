package atividade7;
import java.util.Scanner;

public class Atividade14 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite a primeira nota:");
	        double nota1 = scanner.nextDouble();
	        
	        System.out.println("Digite a segunda nota:");
	        double nota2 = scanner.nextDouble();
	       
	        System.out.println("Digite a terceira nota:");
	        double nota3 = scanner.nextDouble();        

	        System.out.println("Digite a média dos exercícios:");
	        double mediaExercicios = scanner.nextDouble();    

	        double mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;
	        

	        char conceito;
	        if (mediaAproveitamento >= 9.0) {
	            conceito = 'A';
	        } else if (mediaAproveitamento >= 7.5) {
	            conceito = 'B';
	        } else if (mediaAproveitamento >= 6.0) {
	            conceito = 'C';
	        } else {
	            conceito = 'D';
	        }
	        

	        System.out.println("O conceito do aluno é: " + conceito);
	        
	        scanner.close();
	    }
}
