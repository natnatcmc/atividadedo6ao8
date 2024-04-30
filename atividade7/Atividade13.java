package atividade7;
import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a descrição do produto:");
        String descricaoProduto = scanner.nextLine();
        
        System.out.println("Digite a quantidade adquirida:");
        int quantidadeAdquirida = scanner.nextInt();
        
        System.out.println("Digite o preço unitário:");
        double precoUnitario = scanner.nextDouble();
        
        double total = quantidadeAdquirida * precoUnitario;
        
        double desconto;
        if (quantidadeAdquirida <= 5) {
            desconto = total * 0.02;
        } else if (quantidadeAdquirida <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }
        
        double totalAPagar = total - desconto;
        
        System.out.println("Descrição do produto: " + descricaoProduto);
        System.out.println("Total: R$" + total);
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Total a pagar: R$" + totalAPagar);
        
        scanner.close();
    }
}

