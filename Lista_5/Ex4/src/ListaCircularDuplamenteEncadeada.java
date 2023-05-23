class ListaCircularDuplamenteEncadeada {
    Registro cabeca;

    public ListaCircularDuplamenteEncadeada() {
        this.cabeca = null;
    }

    public int contarElementos() {
        int contador = 0;

        if (cabeca == null) {
            return contador;
        }

        Registro atual = cabeca;
        do {
            contador++;
            atual = atual.proximo;
        } while (atual != cabeca);

        return contador;
    }

    public void inserirEsquerda(int dado) {
        Registro novoRegistro = new Registro(dado);

        if (cabeca == null) {
            cabeca = novoRegistro;
            cabeca.anterior = cabeca;
            cabeca.proximo = cabeca;
        } else {
            novoRegistro.proximo = cabeca;
            novoRegistro.anterior = cabeca.anterior;
            cabeca.anterior.proximo = novoRegistro;
            cabeca.anterior = novoRegistro;
        }
    }

    public void concatenar(ListaCircularDuplamenteEncadeada lista) {
        if (cabeca == null) {
            cabeca = lista.cabeca;
        } else if (lista.cabeca != null) {
            Registro ultimoLista1 = cabeca.anterior;
            Registro primeiroLista2 = lista.cabeca;

            ultimoLista1.proximo = primeiroLista2;
            primeiroLista2.anterior = ultimoLista1;

            cabeca.anterior = lista.cabeca.anterior;
            lista.cabeca.anterior.proximo = cabeca;
        }
    }

    public static ListaCircularDuplamenteEncadeada intercalarListasOrdenadas(ListaCircularDuplamenteEncadeada lista1, ListaCircularDuplamenteEncadeada lista2) {
        ListaCircularDuplamenteEncadeada listaIntercalada = new ListaCircularDuplamenteEncadeada();

        Registro atualLista1 = lista1.cabeca;
        Registro atualLista2 = lista2.cabeca;

        while (atualLista1 != lista1.cabeca && atualLista2 != lista2.cabeca) {
            if (atualLista1.dado <= atualLista2.dado) {
                listaIntercalada.inserirEsquerda(atualLista1.dado);
                atualLista1 = atualLista1.proximo;
            } else {
                listaIntercalada.inserirEsquerda(atualLista2.dado);
                atualLista2 = atualLista2.proximo;
            }
        }

        while (atualLista1 != lista1.cabeca) {
            listaIntercalada.inserirEsquerda(atualLista1.dado);
            atualLista1 = atualLista1.proximo;
        }

        while (atualLista2 != lista2.cabeca) {
            listaIntercalada.inserirEsquerda(atualLista2.dado);
            atualLista2 = atualLista2.proximo;
        }

        return listaIntercalada;
    }

    public ListaCircularDuplamenteEncadeada copiar() {
        ListaCircularDuplamenteEncadeada listaCopia = new ListaCircularDuplamenteEncadeada();

        if (cabeca == null) {
            return listaCopia;
        }

        Registro atual = cabeca;
        do {
            listaCopia.inserirEsquerda(atual.dado);
            atual = atual.proximo;
        } while (atual != cabeca);

        return listaCopia;
    }

    public void exibir() {
        if (cabeca == null) {
            System.out.println("A lista circular está vazia.");
            return;
        }

        Registro atual = cabeca;
        do {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        } while (atual != cabeca);

        System.out.println();
    }
}
