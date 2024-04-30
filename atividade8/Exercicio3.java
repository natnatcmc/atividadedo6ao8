package atividade8;

public class Exercicio3 {
    public static void main(String[] args) {
        int somaPares = 0;
        
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            }
        }
        
        System.out.println("O somatório dos valores pares de 1 a 500 é: " + somaPares);
    }
}
