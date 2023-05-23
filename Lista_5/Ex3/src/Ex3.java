class Ex3 {
    public static void main(String[] args) {
        ListaCircularEncadeada lista1 = new ListaCircularEncadeada();
        lista1.inserirEsquerda(3);
        lista1.inserirEsquerda(2);
        lista1.inserirEsquerda(1);

        System.out.println("Lista 1:");
        lista1.exibir();
        System.out.println("Número de elementos na lista 1: " + lista1.contarElementos());

        ListaCircularEncadeada lista2 = new ListaCircularEncadeada();
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

        ListaCircularEncadeada listaOrdenada1 = new ListaCircularEncadeada();
        listaOrdenada1.inserirEsquerda(5);
        listaOrdenada1.inserirEsquerda(3);
        listaOrdenada1.inserirEsquerda(1);

        ListaCircularEncadeada listaOrdenada2 = new ListaCircularEncadeada();
        listaOrdenada2.inserirEsquerda(6);
        listaOrdenada2.inserirEsquerda(4);
        listaOrdenada2.inserirEsquerda(2);

        System.out.println("Lista Ordenada 1:");
        listaOrdenada1.exibir();
        System.out.println("Número de elementos na lista ordenada 1: " + listaOrdenada1.contarElementos());

        System.out.println("Lista Ordenada 2:");
        listaOrdenada2.exibir();
        System.out.println("Número de elementos na lista ordenada 2: " + listaOrdenada2.contarElementos());

        ListaCircularEncadeada listaIntercalada = ListaCircularEncadeada.intercalarListasOrdenadas(listaOrdenada1, listaOrdenada2);
        System.out.println("Lista Intercalada Ordenada:");
        listaIntercalada.exibir();
        System.out.println("Número de elementos na lista intercalada: " + listaIntercalada.contarElementos());

        ListaCircularEncadeada listaCopia = lista1.copiar();
        System.out.println("Cópia da lista:");
        listaCopia.exibir();
        System.out.println("Número de elementos na lista cópia: " + listaCopia.contarElementos());
    }
}
