public class Ex13 {
    public static void multivetor(int[] vetorInteiros, char[] vetorCaracteres, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < vetorInteiros[i]; j++) {
                System.out.print(vetorCaracteres[i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] vetorInteiros = {6, 5, 4, 3, 2, 1};
        char[] vetorCaracteres = {'e', 's', 't', 'u', 'd', 'e'};
        int tamanho = 6;
        multivetor(vetorInteiros, vetorCaracteres, tamanho);
    }
}
