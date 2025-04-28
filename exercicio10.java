import java.util.Scanner;

public class exercicio10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("insira um número positivo: ");
        int numero = scanner.nextInt();
        long fatorial = 1; 
        if (numero < 0) {
            System.out.println("Número inválido, digite um número positivo.");
        } else {
            for (int i = 1; i <= numero; i++) {
                fatorial *= i; 
            }
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
        scanner.close();
    }
}
