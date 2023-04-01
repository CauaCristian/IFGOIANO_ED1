import java.util.Scanner;
import java.util.Arrays;
public class Ex19 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int n;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        System.out.print("Digite o número de busca: ");
        n = sc.nextInt();

        Arrays.sort(num);

        int posicao = busca(num, n);

        System.out.println("\nVETOR");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " - " + num[i]);
        }

        if (posicao != -1) {
            System.out.println("\nPosição no vetor: " + posicao);
        } else {
            System.out.println("\nNão encontrado.");
        }
    }

    public static int busca(int[] vet, int chave) {
        int ini = 0, fim = vet.length - 1, meio;

        while (ini <= fim) {
            meio = (ini + fim) / 2;

            if (chave == vet[meio]) {
                return meio;
            } else if (chave < vet[meio]) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }

        return -1;
    }
}
