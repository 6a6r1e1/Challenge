package desafios;

import java.util.Scanner;

public class dasafio06 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um ano:");
        int ano = scanner.nextInt();
        
        boolean isBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        
        if (isBissexto) {
            System.out.println("O ano " + ano + " � bissexto.");
        } else {
            System.out.println("O ano " + ano + " n�o � bissexto.");
        }
        
        scanner.close();
    }
}