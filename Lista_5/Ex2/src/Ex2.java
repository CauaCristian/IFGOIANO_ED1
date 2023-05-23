class Ex2 {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);

        System.out.println("Lista inicial:");
        lista.exibir();

        int elementoBusca = 3;
        Registro resultadoBusca = lista.buscar(elementoBusca);
        if (resultadoBusca != null) {
            System.out.println("Elemento " + elementoBusca + " encontrado na lista.");
        } else {
            System.out.println("Elemento " + elementoBusca + " não encontrado na lista.");
        }

        int elementoRemover = 2;
        lista.remover(elementoRemover);
        System.out.println("Lista após a remoção do elemento " + elementoRemover + ":");
        lista.exibir();

        int elementoInserir = 5;
        lista.inserir(elementoInserir);
        System.out.println("Lista após a inserção do elemento " + elementoInserir + ":");
        lista.exibir();
    }
}