package desafios;

import java.util.Scanner;

public class desafio11 {

	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite um número:");
	        int numero = scanner.nextInt();
	        
	        if (numero >= 10 && numero <= 20) {
	            System.out.println("O número está no intervalo de 10 a 20.");
	        } else {
	            System.out.println("O número não está no intervalo de 10 a 20.");
	        }
	        
	        scanner.close();
	    }
	}
