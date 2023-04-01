import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        int[] num = new int[5];
        int op = 0;
        boolean flag = false;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n\n\n");
            System.out.println(" MENU VETOR - FUNCAO ");
            System.out.println("\n1 Dados do VETOR");
            System.out.println("2 Ordena VETOR");
            System.out.println("3 Imprime VETOR");
            System.out.println("4 Sai do programa");
            System.out.print("\nOPCAO: ");

            op = input.nextInt();

            switch (op) {
                case 1:
                    entrada(num, 5);
                    flag = true;
                    break;
                case 2:
                    if (flag) {
                        ordena(num, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcao 1");
                    }
                    break;
                case 3:
                    if (flag) {
                        imprime(num, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcao 1");
                    }
                    break;
                case 4:
                    System.out.println("\nSaindo do Algoritmo");
                    break;
                default:
                    System.out.println("\nOpcao invalida");
            }

        } while (op != 4);
    }

    public static int[] entrada(int[] vet, int t) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nEntrada do VETOR");

        for (int i = 0; i < t; i++) {
            System.out.print("Digite numero " + (i + 1) + ": ");
            vet[i] = input.nextInt();
        }

        return vet;
    }

    public static void imprime(int[] vet, int t) {
        System.out.println("\nVETOR");

        for (int i = 0; i < t; i++) {
            System.out.println(" " + (i + 1) + ": " + vet[i]);
        }
    }

    public static void ordena(int[] vet, int tam) {
        int aux;

        for (int i = 0; i < tam - 1; i++) {
            for (int j = i + 1; j < tam; j++) {
                if (vet[i] > vet[j]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
    }

}
