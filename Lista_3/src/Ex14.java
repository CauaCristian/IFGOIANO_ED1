import java.util.Scanner;
public class Ex14 {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        inverte(vetor);

        System.out.println("\nVETOR");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " - " + vetor[i]);
        }
    }

    public static void inverte(int[] vetor) {
        int tamanho = vetor.length;
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = temp;
        }
    }
}
