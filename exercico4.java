public class exercico4 {
    public static void main(String[] args) throws Exception {
        int inicio1 = 0;
        int inicio2 = 1;
        int contador = 2;
        System.out.println(inicio1);
        System.out.println(inicio2);
        while (contador < 10) {
            int sequencia = inicio1 + inicio2;
            System.out.println(sequencia);
          //dificuldade para conseguir chegar nesta parte:  
            inicio1 = inicio2;
            inicio2 = sequencia;
            contador++;
        }
        }
    }

