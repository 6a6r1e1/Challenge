package desafios;

import java.util.Scanner;

public class desafio04 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite o comprimento do primeiro lado do triângulo:");
	        double lado1 = scanner.nextDouble();
	        
	        System.out.println("Digite o comprimento do segundo lado do triângulo:");
	        double lado2 = scanner.nextDouble();
	        
	        System.out.println("Digite o comprimento do terceiro lado do triângulo:");
	        double lado3 = scanner.nextDouble();
	        
	        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
	            System.out.println("Os lados fornecidos formam um triângulo válido.");
	        } else {
	            System.out.println("Os lados fornecidos não formam um triângulo válido.");
	        }
	        
	        scanner.close();
	    }
	}
