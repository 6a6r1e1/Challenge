package desafios;

import java.util.Scanner;

public class desafio04 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite o comprimento do primeiro lado do tri�ngulo:");
	        double lado1 = scanner.nextDouble();
	        
	        System.out.println("Digite o comprimento do segundo lado do tri�ngulo:");
	        double lado2 = scanner.nextDouble();
	        
	        System.out.println("Digite o comprimento do terceiro lado do tri�ngulo:");
	        double lado3 = scanner.nextDouble();
	        
	        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
	            System.out.println("Os lados fornecidos formam um tri�ngulo v�lido.");
	        } else {
	            System.out.println("Os lados fornecidos n�o formam um tri�ngulo v�lido.");
	        }
	        
	        scanner.close();
	    }
	}
