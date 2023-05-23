import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Sorteio sorteio = new Sorteio();
        List<Pilha> pilhas = sorteio.criarPilhas();
        sorteio.sortearNumeros(pilhas);
        sorteio.realizarSorteio(pilhas);

        System.out.println("Pilha 1:\n" + pilhas.get(0));
        System.out.println("Pilha 2:\n" + pilhas.get(1));
        System.out.println("Pilha 3:\n" + pilhas.get(2));
    }
}
