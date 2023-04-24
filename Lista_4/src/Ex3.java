import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Queue<Aviao> fila = new LinkedList<>();


        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Listar o número de aviões aguardando na fila de decolagem");
            System.out.println("2 - Autorizar a decolagem do primeiro avião da fila");
            System.out.println("3 - Adicionar um avião à fila de espera");
            System.out.println("4 - Listar todos os aviões na fila de espera");
            System.out.println("5 - Listar as características do primeiro avião da fila");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Número de aviões aguardando na fila de decolagem: " + fila.size());
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não há aviões aguardando na fila de decolagem.");
                    } else {
                        Aviao aviao = fila.poll();
                        System.out.println("Decolagem autorizada para o avião " + aviao.getNome() + " (" + aviao.getId() + ").");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do avião: ");
                    String nome = scanner.next();
                    System.out.print("Digite o número de identificação do avião: ");
                    int id = scanner.nextInt();
                    Aviao novoAviao = new Aviao(nome, id);
                    fila.offer(novoAviao);
                    System.out.println("Avião " + novoAviao.getNome() + " (" + novoAviao.getId() + ") adicionado à fila de espera.");
                    break;

                case 4:
                    System.out.println("Aviões na fila de espera:");
                    for (Aviao a : fila) {
                        System.out.println(a.getNome() + " (" + a.getId() + ")");
                    }
                    break;

                case 5:
                    if (fila.isEmpty()) {
                        System.out.println("Não há aviões aguardando na fila de decolagem.");
                    } else {
                        Aviao primeiroAviao = fila.peek();
                        System.out.println("Características do primeiro avião da fila:");
                        System.out.println("Nome: " + primeiroAviao.getNome());
                        System.out.println("Número de identificação: " + primeiroAviao.getId());
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    System.exit(0);

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}

