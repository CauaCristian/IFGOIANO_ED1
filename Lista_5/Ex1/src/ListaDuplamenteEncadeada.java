public class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    // Método para concatenar duas listas
    public void concatenar(ListaDuplamenteEncadeada lista) {
        if (this.inicio == null) {
            this.inicio = lista.inicio;
            this.fim = lista.fim;
        } else if (lista.inicio != null) {
            this.fim.proximo = lista.inicio;
            lista.inicio.anterior = this.fim;
            this.fim = lista.fim;
        }
    }

    // Método para separar uma lista em duas novas listas
    public ListaDuplamenteEncadeada[] separar() {
        ListaDuplamenteEncadeada[] resultado = new ListaDuplamenteEncadeada[2];
        resultado[0] = new ListaDuplamenteEncadeada();
        resultado[1] = new ListaDuplamenteEncadeada();

        No atual = this.inicio;
        int contador = 0;

        while (atual != null) {
            if (contador % 2 == 0) {
                resultado[0].adicionarNo(atual.dado);
            } else {
                resultado[1].adicionarNo(atual.dado);
            }

            atual = atual.proximo;
            contador++;
        }

        return resultado;
    }

    // Método para intercalar duas listas ordenadas em uma lista ordenada
    public static ListaDuplamenteEncadeada mesclarListasOrdenadas(ListaDuplamenteEncadeada lista1, ListaDuplamenteEncadeada lista2) {
        ListaDuplamenteEncadeada listaMesclada = new ListaDuplamenteEncadeada();

        No atual1 = lista1.inicio;
        No atual2 = lista2.inicio;

        while (atual1 != null && atual2 != null) {
            if (atual1.dado <= atual2.dado) {
                listaMesclada.adicionarNo(atual1.dado);
                atual1 = atual1.proximo;
            } else {
                listaMesclada.adicionarNo(atual2.dado);
                atual2 = atual2.proximo;
            }
        }

        // Adiciona os elementos restantes da lista1
        while (atual1 != null) {
            listaMesclada.adicionarNo(atual1.dado);
            atual1 = atual1.proximo;
        }

        // Adiciona os elementos restantes da lista2
        while (atual2 != null) {
            listaMesclada.adicionarNo(atual2.dado);
            atual2 = atual2.proximo;
        }

        return listaMesclada;
    }

    public void adicionarNo(int dado) {
        No novoNo = new No(dado);

        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public void exibir() {
        No atual = inicio;

        if (inicio == null) {
            System.out.println("A lista está vazia");
            return;
        }

        System.out.println("Nós da lista duplamente encadeada:");

        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
