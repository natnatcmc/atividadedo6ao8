package atividade6;
import java.util.Scanner;

public class Atividade7 {
	public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[4];
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("Números divisíveis por 2 e 3:");
        for (int numero : numeros) {
            if (numero % 2 == 0 && numero % 3 == 0) {
                System.out.println(numero);
            }
        }
        
        scanner.close();
    }
}
