package desafios;

import java.util.Scanner;

public class desafio13 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();
        
        System.out.println("Digite a categoria do cliente (1 para comum, 2 para associado, 3 para VIP):");
        int categoriaCliente = scanner.nextInt();
        
        double valorFinal = valorCompra;
        
        switch (categoriaCliente) {
            case 1: // Comum (sem desconto)
                break;
            case 2: // Associado (10% de desconto)
                valorFinal = valorCompra * 0.9;
                break;
            case 3: // VIP (20% de desconto)
                valorFinal = valorCompra * 0.8;
                break;
            default:
                System.out.println("Categoria inválida.");
                scanner.close();
                return;
        }
        
        System.out.println("Valor final da compra: R$ " + valorFinal);
        
        scanner.close();
    }
}
