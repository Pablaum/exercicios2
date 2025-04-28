import java.net.CacheRequest;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

public class excercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do{
        System.out.println("1.Adicionar");
        System.out.println("2.Remover");
        System.out.println("3.Sair");
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
            System.out.println("Executando ação de Adicionar");
            break;
            case 2:
            System.out.println("Executando ação de Remover");
            break;
            case 3: 
            System.out.println("Saindo");
                break;
        
            default: System.out.println("Tente novamente");
        }
        }  while (opcao != 3); {
            System.out.println();
            
        }
        scanner.close();
     }
  }
