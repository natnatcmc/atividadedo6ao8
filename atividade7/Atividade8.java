package atividade7;
import java.util.Scanner;

public class Atividade8 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        int[] valoresX = {3, 150, 7, -2, 50};
        int[] valoresY = {2, 3, -1, 5, 3};
        
        for (int i = 0; i < valoresX.length; i++) {
            int x = valoresX[i];
            int y = valoresY[i];
            int z = (x * y) + 5;
            String resposta;
            
            if (z <= 0) {
                resposta = "A";
            } else if (z <= 100) {
                resposta = "B";
            } else {
                resposta = "C";
            }
            
            System.out.println("x = " + x + ", y = " + y + ", z = " + z + ", resposta = " + resposta);
        }
        
        scanner.close();
    }
}

