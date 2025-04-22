import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        System.out.println("insira numeros positivos: ");
        int numero = scanner.nextInt();
        while (numero > 0) {
            soma+= numero;
            System.out.println("insira um numero: ");
            numero = scanner.nextInt(); // dúvida: tentei declarar esse numero em scanner antes porem não rodou, pq? 
        }
        System.out.println("a soma dos positivos é: " + soma);
        scanner.close();
    }
}
