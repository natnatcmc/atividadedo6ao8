package atividade8;

public class Exercicio7 {
    public static void main(String[] args) {
        int n = 15; // número de termos da série Fibonacci a serem mostrados
        int anterior = 1;
        int atual = 1;
        
        System.out.println("Série de Fibonacci até o décimo quinto termo:");
        System.out.print(anterior + " " + atual + " ");
        
        for (int i = 3; i <= n; i++) {
            int proximo = anterior + atual;
            System.out.print(proximo + " ");
            anterior = atual;
            atual = proximo;
        }
    }
}
