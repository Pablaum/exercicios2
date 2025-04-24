import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Insira um número de 1 e 100: ");
            numero = scanner.nextInt();
            if (numero < 1 || numero > 100) {
                System.out.println("Número inválido, Tente novamente.");
            }
        } while (numero < 1 || numero > 100); 
        System.out.println("Número valido: " + numero);

        scanner.close();

      // algumas dúvidas ao resolver este



    }

 }

