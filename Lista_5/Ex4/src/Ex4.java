class Ex4 {
    public static void main(String[] args) {
        ListaCircularDuplamenteEncadeada lista1 = new ListaCircularDuplamenteEncadeada();
        lista1.inserirEsquerda(3);
        lista1.inserirEsquerda(2);
        lista1.inserirEsquerda(1);

        System.out.println("Lista 1:");
        lista1.exibir();
        System.out.println("Número de elementos na lista 1: " + lista1.contarElementos());

        ListaCircularDuplamenteEncadeada lista2 = new ListaCircularDuplamenteEncadeada();
        lista2.inserirEsquerda(6);
        lista2.inserirEsquerda(5);
        lista2.inserirEsquerda(4);

        System.out.println("Lista 2:");
        lista2.exibir();
        System.out.println("Número de elementos na lista 2: " + lista2.contarElementos());

        lista1.concatenar(lista2);
        System.out.println("Lista após a concatenação:");
        lista1.exibir();
        System.out.println("Número de elementos na lista após a concatenação: " + lista1.contarElementos());

        ListaCircularDuplamenteEncadeada listaOrdenada1 = new ListaCircularDuplamenteEncadeada();
        listaOrdenada1.inserirEsquerda(5);
        listaOrdenada1.inserirEsquerda(3);
        listaOrdenada1.inserirEsquerda(1);

        ListaCircularDuplamenteEncadeada listaOrdenada2 = new ListaCircularDuplamenteEncadeada();
        listaOrdenada2.inserirEsquerda(6);
        listaOrdenada2.inserirEsquerda(4);
        listaOrdenada2.inserirEsquerda(2);

        System.out.println("Lista Ordenada 1:");
        listaOrdenada1.exibir();
        System.out.println("Número de elementos na lista ordenada 1: " + listaOrdenada1.contarElementos());

        System.out.println("Lista Ordenada 2:");
        listaOrdenada2.exibir();
        System.out.println("Número de elementos na lista ordenada 2: " + listaOrdenada2.contarElementos());

        ListaCircularDuplamenteEncadeada listaIntercalada = ListaCircularDuplamenteEncadeada.intercalarListasOrdenadas(listaOrdenada1, listaOrdenada2);
        System.out.println("Lista Intercalada Ordenada:");
        listaIntercalada.exibir();
        System.out.println("Número de elementos na lista intercalada: " + listaIntercalada.contarElementos());

        ListaCircularDuplamenteEncadeada listaCopia = lista1.copiar();
        System.out.println("Cópia da lista:");
        listaCopia.exibir();
        System.out.println("Número de elementos na lista cópia: " + listaCopia.contarElementos());
    }
}
