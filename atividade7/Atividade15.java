package atividade7;
import java.util.Scanner;

public class Atividade15 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        

	        System.out.println("Digite o número do empregado (código):");
	        int numeroEmpregado = scanner.nextInt();
	        
	        System.out.println("Digite o ano de nascimento do empregado:");
	        int anoNascimento = scanner.nextInt();
	        
	        System.out.println("Digite o ano de ingresso na empresa do empregado:");
	        int anoIngresso = scanner.nextInt();
	        

	        int idade = 2024 - anoNascimento;
	        

	        int tempoTrabalho = 2024 - anoIngresso;
	        

	        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
	            System.out.println("Idade do empregado: " + idade + " anos");
	            System.out.println("Tempo de trabalho do empregado: " + tempoTrabalho + " anos");
	            System.out.println("Requerer aposentadoria");
	        } 
	        else {
	            System.out.println("Idade do empregado: " + idade + " anos");
	            System.out.println("Tempo de trabalho do empregado: " + tempoTrabalho + " anos");
	            System.out.println("Não requerer");
	        }
	        
	        scanner.close();
	    }
	
}
