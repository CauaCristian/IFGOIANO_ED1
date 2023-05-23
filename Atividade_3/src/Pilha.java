import java.util.ArrayList;
import java.util.List;

class Pilha {
    private List<Integer> elementos;

    public Pilha() {
        elementos = new ArrayList<>();
    }

    public void empilhar(int numero) {
        elementos.add(numero);
    }

    public int desempilhar() {
        if (!elementos.isEmpty()) {
            int topo = elementos.get(elementos.size() - 1);
            elementos.remove(elementos.size() - 1);
            return topo;
        }
        return -1;
    }

    public boolean vazia() {
        return elementos.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = elementos.size() - 1; i >= 0; i--) {
            sb.append(elementos.get(i)).append("\n");
        }
        return sb.toString();
    }
}
