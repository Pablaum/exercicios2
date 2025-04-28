public class exercicio11 {
    public static void main(String[] args) {
        int[] numeros = {5,10,20,30,50,80,100,105,110}; 
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i]; 
        }
        System.out.println("A soma dos elementos é: " + soma);
    }
}
