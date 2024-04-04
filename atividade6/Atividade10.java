package atividade6;

import java.util.Scanner;

public class Atividade10 {
	public static void main (String[]args) {
    Scanner scanner = new Scanner(System.in);
    
 
    System.out.print("Digite um valor entre 1 e 9: ");
    int valor = scanner.nextInt();
    
    // Verificar se o valor está dentro da faixa permitida
    if (valor >= 1 && valor <= 9) {
        System.out.println("O valor está na faixa permitida.");
    } else {
        System.out.println("O valor está fora da faixa permitida.");
    }
    
    scanner.close();
}
}
