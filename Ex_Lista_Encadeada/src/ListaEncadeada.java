public class ListaEncadeada {
    private No cabeça;
    private int tamanho;

    public ListaEncadeada() {
        cabeça = null;
        tamanho = 0;
    }

    public int tamanhoLista() {
        return tamanho;
    }

    public void add(String value) {
        No newNo = new No(value);
        if (cabeça == null) {
            cabeça = newNo;
        } else {
            No atual = cabeça;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = newNo;
        }
        tamanho++;
    }

    public void add(int index, String value) {
        if (index < 0 || index > tamanho) {
            throw new IndexOutOfBoundsException();
        }
        No newNo = new No(value);
        if (index == 0) {
            newNo.proximo = cabeça;
            cabeça = newNo;
        } else {
            No atual = cabeça;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.proximo;
            }
            newNo.proximo = atual.proximo;
            atual.proximo = newNo;
        }
        tamanho++;
    }

    public void remove(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            cabeça = cabeça.proximo;
        } else {
            No atual = cabeça;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.proximo;
            }
            atual.proximo = atual.proximo.proximo;
        }
        tamanho--;
    }

    public boolean contem(String valor) {
        No atual = cabeça;
        while (atual != null) {
            if (atual.dado.equals(valor)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public void clear() {
        cabeça = null;
        tamanho = 0;
    }

    public void printLista() {
        No atual = cabeça;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void addPrimeiro(String dado) {
        No newNo = new No(dado);
        newNo.proximo = cabeça;
        cabeça = newNo;
        tamanho++;
    }


    public void addUltimo(String dado) {
        if (cabeça == null) {
            addPrimeiro(dado);
        } else {
            No newNode = new No(dado);
            No atual = cabeça;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = newNode;
            tamanho++;
        }
    }


    public void removePrimeiro() {
        if (cabeça != null) {
            cabeça = cabeça.proximo;
            tamanho--;
        }
    }


    public void removeUltimo() {
        if (cabeça != null) {
            if (cabeça.proximo == null) {
                removePrimeiro();
            } else {
                No atual = cabeça;
                while (atual.proximo.proximo != null) {
                    atual = atual.proximo;
                }
                atual.proximo = null;
                tamanho--;
            }
        }
    }


}

