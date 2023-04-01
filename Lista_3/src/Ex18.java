public class Ex18 {
    public static void main(String[] args) {
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite nome " + (i+1) + ": ");
            nomes[i] = System.console().readLine();
        }

        ordena(nomes);

        System.out.println("\nNOMES ORDENADOS:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + " - " + nomes[i]);
        }
    }

    public static void ordena(String[] vet) {
        int tam = vet.length;

        for (int i = 0; i < tam-1; i++) {
            for (int j = i+1; j < tam; j++) {
                if (vet[i].compareToIgnoreCase(vet[j]) > 0) {
                    String aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
    }
}
