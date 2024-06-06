package desafios;

import java.util.Scanner;

public class desafio14 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite um n�mero:");
	        double numero = scanner.nextDouble();
	        
	        if (numero > 0) {
	            double raizQuadrada = Math.sqrt(numero);
	            System.out.println("O n�mero � positivo. Raiz quadrada: " + raizQuadrada);
	        } else if (numero < 0) {
	            double quadrado = numero * numero;
	            System.out.println("O n�mero � negativo. Ao quadrado: " + quadrado);
	        } else {
	            System.out.println("O n�mero � zero.");
	        }
	        
	        scanner.close();
	    }
	}
