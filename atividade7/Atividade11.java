package atividade7;
import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de morangos em kg:");
        double quantidadeMorangos = scanner.nextDouble();
        
        System.out.println("Digite a quantidade de maçãs em kg:");
        double quantidadeMaca = scanner.nextDouble();

        double precoMorango;
        if (quantidadeMorangos <= 5) {
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }

        double precoMaca;
        if (quantidadeMaca <= 5) {
            precoMaca = 2.20;
        } else {
            precoMaca = 1.50;
        }

        double precoTotalSemDesconto = (quantidadeMorangos * precoMorango) + (quantidadeMaca * precoMaca);

        if (quantidadeMorangos + quantidadeMaca > 8 || precoTotalSemDesconto > 25.00) {
            double desconto = precoTotalSemDesconto * 0.10;
            precoTotalSemDesconto -= desconto;
            System.out.println("Devido ao desconto adicional, o cliente recebeu um desconto de 10% sobre o total da compra.");
        }

        System.out.println("O preço total a ser pago é: R$" + precoTotalSemDesconto);
        
        scanner.close();
    }
}
