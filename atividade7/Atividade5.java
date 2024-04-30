package atividade7;
import java.util.Scanner;

public class Atividade5 {
	
	    public static void main(String[] args) {
	    	
	    	Scanner scanner = new Scanner(System.in);
	    	
	        System.out.println("Digite as medidas dos lados do triângulo (A, B e C):");
	        double ladoA = scanner.nextDouble();
	        double ladoB = scanner.nextDouble();
	        double ladoC = scanner.nextDouble();
	        

	        boolean formaTriangulo = (ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB);
	        

	        if (formaTriangulo) {
	            System.out.println("Os valores formam um triângulo.");
	        } else {
	            System.out.println("Os valores não formam um triângulo.");
	        }
	        
	        scanner.close();
	    }
	}

