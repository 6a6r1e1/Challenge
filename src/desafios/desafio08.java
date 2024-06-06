package desafios;

import java.util.Scanner;

public class desafio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a nota do aluno (0 a 10):");
        double nota = scanner.nextDouble();
        
        if (nota >= 9 && nota <= 10) {
            System.out.println("Conceito: A");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Conceito: B");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Conceito: C");
        } else if (nota >= 3 && nota < 5) {
            System.out.println("Conceito: D");
        } else if (nota >= 0 && nota < 3) {
            System.out.println("Conceito: F");
        } else {
            System.out.println("Nota inválida");
        }
        
        scanner.close();
    }
}

