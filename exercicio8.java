import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double somaNotas = 0;
        int quantidadeNotas = 0;
        char resposta;

        do {
            System.out.print("Digite uma nota: ");
            double nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                somaNotas += nota;
                quantidadeNotas++;
            } else {
                System.out.println("Nota inválida digite uma nota entre 0 e 10.");
            }

            System.out.print("Deseja inserir outra nota? (s/n): ");
            resposta = scanner.next().toLowerCase().charAt(0); // primeiro caracter em minúsculo 

        } while (resposta == 's'); 
        if (quantidadeNotas > 0) {
            double media = somaNotas / quantidadeNotas;
            System.out.println("Média das notas: " + media);
        } else {
            System.out.println("nota válida não inserida.");
        }

        scanner.close();
    }
}

