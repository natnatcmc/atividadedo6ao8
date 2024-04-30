package atividade7;
import java.util.Scanner;

public class Atividade9 {

        public static void main(String[] args) {
        	
        
            Scanner scanner = new Scanner(System.in);
            

            final double PRECO_GASOLINA = 3.30;
            final double PRECO_ALCOOL = 2.90;
            
            System.out.println("Bem-vindo ao posto de combustíveis!");
            System.out.println("Por favor, informe o tipo de combustível (A - Álcool, G - Gasolina):");
            char tipoCombustivel = scanner.next().charAt(0);
            
            System.out.println("Quantos litros você deseja abastecer?");
            int litrosAbastecidos = scanner.nextInt();
            
            double precoLitro;
            double desconto;
            

            if (tipoCombustivel == 'A' || tipoCombustivel == 'a') { 
                if (litrosAbastecidos <= 20) {
                    precoLitro = PRECO_ALCOOL - (PRECO_ALCOOL * 0.03);
                } else {
                    precoLitro = PRECO_ALCOOL - (PRECO_ALCOOL * 0.05);
                }
            } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') { 
                if (litrosAbastecidos <= 20) {
                    precoLitro = PRECO_GASOLINA - (PRECO_GASOLINA * 0.04);
                } else {
                    precoLitro = PRECO_GASOLINA - (PRECO_GASOLINA * 0.06);
                }
            } else {
                System.out.println("Tipo de combustível inválido.");
                scanner.close();
                return;
            }
            
            double valorTotal = litrosAbastecidos * precoLitro;
            
            System.out.println("O valor total a ser pago é: R$" + valorTotal);
            
            scanner.close();
        }
}
