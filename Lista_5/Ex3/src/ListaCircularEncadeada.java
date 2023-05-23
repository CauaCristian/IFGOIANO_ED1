class ListaCircularEncadeada {
    Registro cabeca;

    public ListaCircularEncadeada() {
        this.cabeca = null;
    }

    public int contarElementos() {
        int contador = 0;

        if (cabeca == null) {
            return contador;
        }

        Registro atual = cabeca;
        contador++;

        while (atual.proximo != cabeca) {
            contador++;
            atual = atual.proximo;
        }

        return contador;
    }

    public void inserirEsquerda(int dado) {
        Registro novoRegistro = new Registro(dado);

        if (cabeca == null) {
            cabeca = novoRegistro;
            cabeca.proximo = cabeca;
        } else {
            novoRegistro.proximo = cabeca.proximo;
            cabeca.proximo = novoRegistro;
        }
    }

    public void concatenar(ListaCircularEncadeada lista) {
        if (cabeca == null) {
            cabeca = lista.cabeca;
        } else if (lista.cabeca != null) {
            Registro ultimoLista1 = cabeca.proximo;
            cabeca.proximo = lista.cabeca.proximo;
            lista.cabeca.proximo = ultimoLista1;
        }
    }

    public static ListaCircularEncadeada intercalarListasOrdenadas(ListaCircularEncadeada lista1, ListaCircularEncadeada lista2) {
        ListaCircularEncadeada listaIntercalada = new ListaCircularEncadeada();

        Registro atualLista1 = lista1.cabeca;
        Registro atualLista2 = lista2.cabeca;

        while (atualLista1 != null && atualLista2 != null) {
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

    public ListaCircularEncadeada copiar() {
        ListaCircularEncadeada listaCopia = new ListaCircularEncadeada();

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
