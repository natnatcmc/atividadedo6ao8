package atividade8;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("Potências de 3:");

        long resultado = 1; // Começa com 3 elevado a 0

        for (int expoente = 0; expoente <= 15; expoente++) {
            System.out.println("3^" + expoente + " = " + resultado);
            resultado *= 3; // Multiplica por 3 para obter a próxima potência
        }
    }
}
