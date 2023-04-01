import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[3];
        String[] endereco = new String[3];
        String[] profissao = new String[3];

        // lê os dados
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Digite endereco: ");
            endereco[i] = sc.nextLine();
            System.out.print("Digite profissao: ");
            profissao[i] = sc.nextLine();
        }

        // ordena os dados pelo nome usando a função troca
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (nome[i].compareTo(nome[j]) > 0) {
                    troca(nome, i, j);
                    troca(endereco, i, j);
                    troca(profissao, i, j);
                }
            }
        }

        // imprime os dados ordenados
        for (int i = 0; i < 3; i++) {
            System.out.println(nome[i] + "\t" + endereco[i] + "\t" + profissao[i]);
        }
    }

    // função que troca os elementos de índice i e j em um vetor de strings
    public static void troca(String[] vetor, int i, int j) {
        String temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
}
