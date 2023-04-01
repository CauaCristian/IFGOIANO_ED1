public class Ex12 {
    public static int produtoInterno(int[] vetor1, int[] vetor2, int tamanho) {
        int produto = 0;
        for (int i = 0; i < tamanho; i++) {
            produto += vetor1[i] * vetor2[i];
        }
        return produto;
    }

    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4};
        int[] vetor2 = {4, 3, 2, 1};
        int tamanho = 4;
        int produtoInterno = produtoInterno(vetor1, vetor2, tamanho);
        System.out.println("VETOR 1\tVETOR 2");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor1[i] + "\t" + vetor2[i]);
        }
        System.out.println("\nProduto interno: " + produtoInterno);
    }
}

