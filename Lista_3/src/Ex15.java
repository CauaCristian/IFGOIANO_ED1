import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] palavras = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a palavra em letras minúsculas " + (i+1) + ": ");
            palavras[i] = input.nextLine();
            palavras[i] = restantes(palavras[i], palavras[i].length(), 'c');
        }
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + " - " + palavras[i]);
        }
    }

    public static String restantes(String vet, int tam, char x) {
        int cont = 0;
        char[] vetorChar = vet.toCharArray();
        for (int i = 0; i < tam; i++) {
            if (vetorChar[i] == x) {
                vetorChar[i] = '*';
                cont++;
            }
        }
        String resultado = String.valueOf(vetorChar);
        return resultado;
    }
}
