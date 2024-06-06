package desafios;

import java.util.Scanner;

public class desafio05 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota do aluno:");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota do aluno:");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota do aluno:");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.printf("A média do aluno é: %.2f\n", media);
        
        if (media >= 7) {
            System.out.println("O aluno está aprovado.");
        } else if (media >= 5) {
            System.out.println("O aluno está em recuperação.");
        } else {
            System.out.println("O aluno está reprovado.");
        }
        
        scanner.close();
    }
}
