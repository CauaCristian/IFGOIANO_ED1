class ListaDuplamenteEncadeada {
    Registro cabeca;

    public ListaDuplamenteEncadeada() {
        this.cabeca = new Registro(-1);
        this.cabeca.anterior = this.cabeca;
        this.cabeca.proximo = this.cabeca;
    }

    public Registro buscar(int dado) {
        Registro atual = cabeca.proximo;

        while (atual != cabeca) {
            if (atual.dado == dado) {
                return atual;
            }
            atual = atual.proximo;
        }

        return null;
    }

    public void inserir(int dado) {
        Registro novoRegistro = new Registro(dado);

        novoRegistro.proximo = cabeca.proximo;
        novoRegistro.anterior = cabeca;
        cabeca.proximo.anterior = novoRegistro;
        cabeca.proximo = novoRegistro;
    }

    public void remover(int dado) {
        Registro registroRemover = buscar(dado);

        if (registroRemover != null) {
            registroRemover.anterior.proximo = registroRemover.proximo;
            registroRemover.proximo.anterior = registroRemover.anterior;
            registroRemover.anterior = null;
            registroRemover.proximo = null;
        }
    }

    public void exibir() {
        Registro atual = cabeca.proximo;

        System.out.println("Elementos da lista duplamente encadeada:");

        while (atual != cabeca) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
