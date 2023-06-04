import java.util.Random;

class NumeroAleatorio {
    public static void main(String[] args) {
        // Gerar números aleatórios e armazená-los no vetor
        int[] vetor = new int[1000];
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(19999) - 9999;
        }

        // Criar a lista duplamente encadeada
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        // Inserir números na lista em ordem crescente
        for (int num : vetor) {
            lista.inserirOrdenado(num);
        }

        // Imprimir lista em ordem crescente
        System.out.println("Lista em ordem crescente:");
        lista.imprimirOrdemCrescente();

        // Imprimir lista em ordem decrescente
        System.out.println("\nLista em ordem decrescente:");
        lista.imprimirOrdemDecrescente();

        // Remover números primos da lista
        lista.removerNumerosPrimos();

        // Imprimir lista após remover números primos
        System.out.println("\nLista após remover números primos:");
        lista.imprimirOrdemCrescente();
    }
}

