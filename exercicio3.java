import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        final String SenhaCorreta = "1234";
        String SenhaDigitada = "";
        System.out.println("insira a senha: ");
        SenhaDigitada = scanner.nextLine();
        while (SenhaDigitada.equals(SenhaCorreta)== false) {
            System.out.println("senha incorreta, tente novamente");
            SenhaDigitada = scanner.nextLine();
        }
        System.out.println("senha correta, acesso concedido");
        scanner.close();

        }         

        }
            
        
        

    

