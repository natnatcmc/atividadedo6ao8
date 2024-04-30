package atividade8;
import java.util.Scanner;

public class Exercicio11 {
	  public static void main(String[] args) {
	       
		    Scanner scanner = new Scanner(System.in);
	        double areaTotal = 0;
	        
	        do {
	            System.out.print("Digite o nome do cômodo: ");
	            String nome = scanner.nextLine();
	            
	            System.out.print("Digite a largura do cômodo em metros: ");
	            double largura = scanner.nextDouble();
	            
	            System.out.print("Digite o comprimento do cômodo em metros: ");
	            double comprimento = scanner.nextDouble();
	            
	            double areaCcomodo = largura * comprimento;
	            areaTotal += areaCcomodo;
	            
	            System.out.println("A área do cômodo " + nome + " é de " + areaCcomodo + " metros quadrados.");
	            
	            scanner.nextLine(); // Limpar o buffer do scanner
	            
	            System.out.print("Deseja calcular mais um cômodo? (SIM/NAO): ");
	            String continuar = scanner.nextLine();
	            
	            if (!continuar.equalsIgnoreCase("SIM")) {
	                break;
	            }
	        } while (true);
	        
	        System.out.println("A área total da residência é de " + areaTotal + " metros quadrados.");
	        
	        scanner.close();
	    }
}
