package desafios;

import java.util.Scanner;

public class desafio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro n�mero:");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo n�mero:");
        double numero2 = scanner.nextDouble();
        
        System.out.println("Digite a opera��o (adi��o, subtra��o, multiplica��o, divis�o):");
        String operacao = scanner.next();
        
        double resultado;
        
        switch (operacao.toLowerCase()) {
            case "adi��o":
            case "add":
            case "soma":
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "subtra��o":
            case "sub":
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "multiplica��o":
            case "multi":
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "divis�o":
            case "div":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divis�o por zero.");
                }
                break;
            default:
                System.out.println("Opera��o inv�lida.");
                break;
        }
        
        scanner.close();
    }
}

