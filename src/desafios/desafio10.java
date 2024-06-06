package desafios;

import java.util.Scanner;

public class desafio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();
        
        System.out.println("Digite a operação (adição, subtração, multiplicação, divisão):");
        String operacao = scanner.next();
        
        double resultado;
        
        switch (operacao.toLowerCase()) {
            case "adição":
            case "add":
            case "soma":
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "subtração":
            case "sub":
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "multiplicação":
            case "multi":
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "divisão":
            case "div":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
        
        scanner.close();
    }
}

