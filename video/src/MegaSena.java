import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class MegaSena {
    public static void main(String[] args) {
        // Números sorteados na Mega Sena
        int[] numerosSorteados = {1, 15, 16, 25, 32, 36};

        // Sortear 51 milhões de números aleatórios e inserir na lista
        List<Integer> listaNumeros = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 51000000; i++) {
            listaNumeros.add(random.nextInt());
        }

        // Procurar a sequência exata dos números sorteados na lista em ordem direta
        int sequenciaIndex = -1;
        for (int i = 0; i < listaNumeros.size() - numerosSorteados.length + 1; i++) {
            boolean encontrouSequencia = true;
            for (int j = 0; j < numerosSorteados.length; j++) {
                if (listaNumeros.get(i + j) != numerosSorteados[j]) {
                    encontrouSequencia = false;
                    break;
                }
            }

            if (encontrouSequencia) {
                sequenciaIndex = i;
                break;
            }
        }

        if (sequenciaIndex != -1) {
            System.out.println("Sequência encontrada na posição: " + sequenciaIndex);
        } else {
            System.out.println("Sequência não encontrada.");
        }

        // Contar quantas vezes a sequência aparece na lista
        int sequenciaCount = 0;
        for (int i = 0; i < listaNumeros.size() - numerosSorteados.length + 1; i++) {
            boolean encontrouSequencia = true;
            for (int j = 0; j < numerosSorteados.length; j++) {
                if (listaNumeros.get(i + j) != numerosSorteados[j]) {
                    encontrouSequencia = false;
                    break;
                }
            }

            if (encontrouSequencia) {
                sequenciaCount++;
            }
        }

        System.out.println("A sequência aparece " + sequenciaCount + " vezes na lista.");

        // Verificar se a sequência aparece na lista em ordem inversa
        List<Integer> numerosSorteadosReverso = new ArrayList<>();
        for (int i = numerosSorteados.length - 1; i >= 0; i--) {
            numerosSorteadosReverso.add(numerosSorteados[i]);
        }

        int sequenciaReversaIndex = -1;
        for (int i = 0; i < listaNumeros.size() - numerosSorteadosReverso.size() + 1; i++) {
            boolean encontrouSequenciaReversa = true;
            for (int j = 0; j < numerosSorteadosReverso.size(); j++) {
                if (listaNumeros.get(i + j) != numerosSorteadosReverso.get(j)) {
                    encontrouSequenciaReversa = false;
                    break;
                }
            }

            if (encontrouSequenciaReversa) {
                sequenciaReversaIndex = i;
                break;
            }
        }

        if (sequenciaReversaIndex != -1) {
            System.out.println("Sequência reversa encontrada na posição: " + sequenciaReversaIndex);
        } else {
            System.out.println("Sequência reversa não encontrada.");
        }

        // Contar quantas vezes a sequência aparece na lista em ordem inversa
        int sequenciaReversaCount = 0;
        for (int i = 0; i < listaNumeros.size() - numerosSorteadosReverso.size() + 1; i++) {
            boolean encontrouSequenciaReversa = true;
            for (int j = 0; j < numerosSorteadosReverso.size(); j++) {
                if (listaNumeros.get(i + j) != numerosSorteadosReverso.get(j)) {
                    encontrouSequenciaReversa = false;
                    break;
                }
            }

            if (encontrouSequenciaReversa) {
                sequenciaReversaCount++;
            }
        }

        System.out.println("A sequência reversa aparece " + sequenciaReversaCount + " vezes na lista.");
    }
}

