package atividade7;
import java.util.Scanner;

public class Atividade6 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite o nome do primeiro time:");
	        String time1 = scanner.nextLine();
	        System.out.println("Digite o número de gols marcados pelo " + time1 + ":");
	        int golsTime1 = scanner.nextInt();
	        
	        scanner.nextLine(); 
	        System.out.println("Digite o nome do segundo time:");
	        String time2 = scanner.nextLine();
	        System.out.println("Digite o número de gols marcados pelo " + time2 + ":");
	        int golsTime2 = scanner.nextInt();
	        
	        String vencedor;
	        if (golsTime1 > golsTime2) {
	            vencedor = time1;
	        } else if (golsTime2 > golsTime1) {
	            vencedor = time2;
	        } else {
	            vencedor = "EMPATE";
	        }
	        

	        System.out.println("O vencedor da partida é: " + vencedor);
	        
	        scanner.close();
	    }
	}

