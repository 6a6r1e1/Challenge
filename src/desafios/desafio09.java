package desafios;

import java.util.Scanner;

public class desafio09 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o c�digo do produto:");
        int codigo = scanner.nextInt();
        
        if (codigo >= 1 && codigo <= 10) {
            System.out.println("Categoria: Alimento n�o-perec�vel");
        } else if (codigo >= 11 && codigo <= 20) {
            System.out.println("Categoria: Alimento perec�vel");
        } else if (codigo >= 21 && codigo <= 30) {
            System.out.println("Categoria: Vestu�rio");
        } else if (codigo >= 31 && codigo <= 40) {
            System.out.println("Categoria: Eletr�nicos");
        } else {
            System.out.println("C�digo inv�lido");
        }
        
        scanner.close();
    }
}
