package desafios;

import java.util.Scanner;

public class desafio02 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um n�mero inteiro:");
        int numero = scanner.nextInt();
        
        if (numero > 0) {
            System.out.println("O n�mero " + numero + " � positivo.");
        } else if (numero < 0) {
            System.out.println("O n�mero " + numero + " � negativo.");
        } else {
            System.out.println("O n�mero � zero.");
        }
        
        scanner.close();
    }
}