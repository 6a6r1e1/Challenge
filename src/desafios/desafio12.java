package desafios;

import java.util.Scanner;

public class desafio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um n�mero:");
        double numero = scanner.nextDouble();
        
        if (numero > 100) {
            System.out.println("O n�mero � maior que 100.");
        } else {
            double dobro = numero * 2;
            System.out.println("O n�mero n�o � maior que 100, o dobro �: " + dobro);
        }
        
        scanner.close();
    }
}

