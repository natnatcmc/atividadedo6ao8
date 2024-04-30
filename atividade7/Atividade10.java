package atividade7;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a idade do primeiro homem:");
        int idadeHomem1 = scanner.nextInt();
        
        System.out.println("Digite a idade do segundo homem:");
        int idadeHomem2 = scanner.nextInt();
        
        System.out.println("Digite a idade da primeira mulher:");
        int idadeMulher1 = scanner.nextInt();
        
        System.out.println("Digite a idade da segunda mulher:");
        int idadeMulher2 = scanner.nextInt();
        
        int somaIdades = Math.max(idadeHomem1, idadeHomem2) + Math.min(idadeMulher1, idadeMulher2);
        
        int produtoIdades = Math.min(idadeHomem1, idadeHomem2) * Math.max(idadeMulher1, idadeMulher2);
        
        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + somaIdades);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produtoIdades);
        
        scanner.close();
    }
}
