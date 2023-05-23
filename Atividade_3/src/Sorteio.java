import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Sorteio {
    private Random random;

    public Sorteio() {
        random = new Random();
    }

    public List<Pilha> criarPilhas() {
        List<Pilha> pilhas = new ArrayList<>();
        pilhas.add(new Pilha()); // Pilha 1
        pilhas.add(new Pilha()); // Pilha 2
        pilhas.add(new Pilha()); // Pilha 3
        return pilhas;
    }

    public void sortearNumeros(List<Pilha> pilhas) {
        for (int i = 0; i < 100; i++) {
            int numero = random.nextInt(9) + 1;
            if (numero >= 1 && numero <= 3) {
                pilhas.get(0).empilhar(numero); // Pilha 1
            } else if (numero >= 4 && numero <= 6) {
                pilhas.get(1).empilhar(numero); // Pilha 2
            } else {
                pilhas.get(2).empilhar(numero); // Pilha 3
            }
        }
    }

    public void realizarSorteio(List<Pilha> pilhas) {
        int numerosSorteados = 0;
        while (numerosSorteados < 100 && !pilhas.get(0).vazia() && !pilhas.get(1).vazia() && !pilhas.get(2).vazia()) {
            int numeroSorteado = random.nextInt(3) + 1;
            Pilha pilhaEscolhida = pilhas.get(numeroSorteado - 1);
            Pilha pilhaAux1 = pilhas.get((numeroSorteado % 3));
            Pilha pilhaAux2 = pilhas.get(((numeroSorteado + 1) % 3));
            int numero1 = pilhaAux1.desempilhar();
            int numero2 = pilhaAux2.desempilhar();

            pilhaEscolhida.empilhar(numero1);
            pilhaEscolhida.empilhar(numero2);

            System.out.println("Empilhando os números " + numero1 + " e " + numero2 + " na pilha " + numeroSorteado);

            numerosSorteados++;
        }

        if (pilhas.get(2).vazia()) {
            System.out.println("O programa foi encerrado porque a pilha 3 está vazia");
        } else if (numerosSorteados == 100) {
            System.out.println("O programa foi encerrado porque foram sorteados 100 números");
        }
    }
}
