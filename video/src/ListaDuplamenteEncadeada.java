class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;

    //representa os nós da lista
    private class No {
        int valor;
        No anterior;
        No proximo;

        public No(int valor) {
            this.valor = valor;
            this.anterior = null;
            this.proximo = null;
        }
    }

    public void inserirOrdenado(int valor) {
        No novoNo = new No(valor);

        // Se a lista estiver vazia, o novo nó será o início e o fim da lista
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        }
        // Se o valor for menor que o valor do nó de início, o novo nó se torna o novo início
        else if (valor < inicio.valor) {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
        // Se o valor for maior que o valor do nó de fim, o novo nó se torna o novo fim
        else if (valor > fim.valor) {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
        // Caso contrário, percorremos a lista para encontrar a posição correta de inserção
        else {
            No atual = inicio;
            while (atual.valor < valor) {
                atual = atual.proximo;
            }
            No anterior = atual.anterior;

            // Realiza a inserção do novo nó na posição correta da lista
            novoNo.anterior = anterior;
            novoNo.proximo = atual;
            anterior.proximo = novoNo;
            atual.anterior = novoNo;
        }
    }

    public void removerNumerosPrimos() {
        No atual = inicio;
        while (atual != null) {
            // Verifica se o valor do nó atual é primo
            if (isPrimo(atual.valor)) {
                No anterior = atual.anterior;
                No proximo = atual.proximo;

                // Atualiza as referências dos nós anterior e próximo para remover o nó atual
                if (anterior != null) {
                    anterior.proximo = proximo;
                } else {
                    // Se o nó a ser removido é o primeiro nó da lista, atualiza o início
                    inicio = proximo;
                }

                if (proximo != null) {
                    proximo.anterior = anterior;
                } else {
                    // Se o nó a ser removido é o último nó da lista, atualiza o fim
                    fim = anterior;
                }
            }

            atual = atual.proximo;
        }
    }

    private boolean isPrimo(int num) {
        // Verifica se o número é menor que 2, pois números menores que 2 não são primos
        if (num < 2) {
            return false;
        }

        // Percorre os números de 2 até a raiz quadrada do número para verificar se é divisível
        // por algum número além de 1 e ele mesmo
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        // Se não encontrou divisores, o número é primo
        return true;
    }

    public void imprimirOrdemCrescente() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void imprimirOrdemDecrescente() {
        No atual = fim;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }
}
