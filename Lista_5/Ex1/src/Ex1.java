public class Ex1 {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista1 = new ListaDuplamenteEncadeada();
        lista1.adicionarNo(1);
        lista1.adicionarNo(3);
        lista1.adicionarNo(5);

        ListaDuplamenteEncadeada lista2 = new ListaDuplamenteEncadeada();
        lista2.adicionarNo(2);
        lista2.adicionarNo(4);
        lista2.adicionarNo(6);

        System.out.println("Lista 1:");
        lista1.exibir();

        System.out.println("Lista 2:");
        lista2.exibir();

        // Concatenar lista1 com lista2
        lista1.concatenar(lista2);
        System.out.println("Lista após a concatenação:");
        lista1.exibir();

        // Separar a lista em duas novas listas
        ListaDuplamenteEncadeada[] listasSeparadas = lista1.separar();
        System.out.println("Lista Separada 1:");
        listasSeparadas[0].exibir();
        System.out.println("Lista Separada 2:");
        listasSeparadas[1].exibir();

        ListaDuplamenteEncadeada listaOrdenada1 = new ListaDuplamenteEncadeada();
        listaOrdenada1.adicionarNo(1);
        listaOrdenada1.adicionarNo(3);
        listaOrdenada1.adicionarNo(5);

        ListaDuplamenteEncadeada listaOrdenada2 = new ListaDuplamenteEncadeada();
        listaOrdenada2.adicionarNo(2);
        listaOrdenada2.adicionarNo(4);
        listaOrdenada2.adicionarNo(6);

        System.out.println("Lista Ordenada 1:");
        listaOrdenada1.exibir();

        System.out.println("Lista Ordenada 2:");
        listaOrdenada2.exibir();

        // Intercalar duas listas ordenadas
        ListaDuplamenteEncadeada listaMesclada = ListaDuplamenteEncadeada.mesclarListasOrdenadas(listaOrdenada1, listaOrdenada2);
        System.out.println("Lista Mesclada Ordenada:");
        listaMesclada.exibir();
    }
}