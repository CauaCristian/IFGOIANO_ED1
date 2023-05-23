class ListaCircularEncadeada {
    Registro cabeca;

    public ListaCircularEncadeada() {
        this.cabeca = new Registro(-1); // Nó cabeça
        this.cabeca.proximo = this.cabeca; // O nó cabeça aponta para si mesmo
    }

    public int contarElementos() {
        int contador = 0;

        if (cabeca.proximo == cabeca) {
            return contador;
        }

        Registro atual = cabeca.proximo;
        while (atual != cabeca) {
            contador++;
            atual = atual.proximo;
        }

        return contador;
    }

    public void inserirEsquerda(int dado) {
        Registro novoRegistro = new Registro(dado);

        novoRegistro.proximo = cabeca.proximo;
        cabeca.proximo = novoRegistro;
    }

    public void concatenar(ListaCircularEncadeada lista) {
        if (lista.cabeca.proximo != lista.cabeca) {
            Registro ultimoLista1 = cabeca;
            while (ultimoLista1.proximo != cabeca) {
                ultimoLista1 = ultimoLista1.proximo;
            }

            ultimoLista1.proximo = lista.cabeca.proximo;
            lista.cabeca.proximo = cabeca;
        }
    }

    public static ListaCircularEncadeada intercalarListasOrdenadas(ListaCircularEncadeada lista1, ListaCircularEncadeada lista2) {
        ListaCircularEncadeada listaIntercalada = new ListaCircularEncadeada();

        Registro atualLista1 = lista1.cabeca.proximo;
        Registro atualLista2 = lista2.cabeca.proximo;

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

    public ListaCircularEncadeada copiar() {
        ListaCircularEncadeada listaCopia = new ListaCircularEncadeada();

        Registro atual = cabeca.proximo;
        while (atual != cabeca) {
            listaCopia.inserirEsquerda(atual.dado);
            atual = atual.proximo;
        }

        return listaCopia;
    }

    public void exibir() {
        if (cabeca.proximo == cabeca) {
            System.out.println("A lista circular está vazia.");
            return;
        }

        Registro atual = cabeca.proximo;
        while (atual != cabeca) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }

        System.out.println();
    }
}
