package atividade6;

import java.util.Scanner;

/**
 * 4. Ler quatro valores referentes a quatro notas 
 * escolares de um aluno e imprimir uma mensagem 
 * dizendo que o aluno foi aprovado, se o valor 
 * da média escolar for maior ou igual a 7. Se o valor 
 * da média for menor que 7, solicitar a nota de exame, 
 * somar com o valor da média e obter nova média. 
 * Se a nova média for maior ou igual a 5, apresentar 
 * uma mensagem dizendo que o aluno foi aprovado em exame. 
 * Se o aluno não foi aprovado, indicar uma mensagem 
 * informando esta condição. Apresentar com as mensagens 
 * o valor da média do aluno, para qualquer condição.
 */
public class Atividade4 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Olá iremos cálcular a sua nota e ver se você foi aprovado(a)!");
		System.out.println("Insira a primeira nota: ");
		int nota1 = sc.nextInt();
		System.out.println("Insira a segunda nota: ");
		int nota2 = sc.nextInt();
		System.out.println("Insira a terceira nota: ");
		int nota3 = sc.nextInt();
		System.out.println("Insira a quarta nota: ");
		int nota4 = sc.nextInt();
		
		
		int media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		
		if (media >= 7) {
			System.out.println("Aprovado! Sua nota é: " + media);
			
		} else if (media < 7 ){
			System.out.println("Insira a nota do exame por favor!:");
			int notaExame = sc.nextInt();
			 double novaMedia = (media + notaExame) / 2;
	            System.out.println("A nova média do aluno é: " + novaMedia);
		if (novaMedia >= 5){
			 System.out.println("O aluno foi aprovado no exame!");
		} else {
			System.out.println("O aluno foi reprovado.");
		}
	
	}
}
}