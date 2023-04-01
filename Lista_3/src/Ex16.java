import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int resultado = verificaOrdem(numeros);
        if (resultado == 1) {
            System.out.println("ORDENAÇÃO CRESCENTE");
        } else if (resultado == 2) {
            System.out.println("ORDENAÇÃO DECRESCENTE");
        } else {
            System.out.println("NÃO ESTÁ ORDENADO");
        }

        sc.close();
    }

    public static int busca(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i+1]) {
                return 2;
            }
        }
        return 1;
    }

    public static int buscaInversa(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] < vetor[i+1]) {
                return 2;
            }
        }
        return 1;
    }

    public static int verificaOrdem(int[] vetor) {
        int resultadoBusca = busca(vetor);
        if (resultadoBusca == 1) {
            return 1;
        } else {
            int resultadoBuscaInversa = buscaInversa(vetor);
            if (resultadoBuscaInversa == 1) {
                return 2;
            } else {
                return 0;
            }
        }
    }

}
