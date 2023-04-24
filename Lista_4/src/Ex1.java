import java.util.Scanner;
import java.util.Stack;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma sequência de caracteres: ");
        String sequencia = scanner.nextLine();


        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < sequencia.length(); i++) {
            pilha.push(sequencia.charAt(i));
        }
        System.out.print("Texto na ordem inversa: ");
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
        System.out.println();


        String textoSemEspacosEPontos = sequencia.replaceAll("[\\s.]", "");
        Stack<Character> pilha2 = new Stack<>();
        for (int i = 0; i < textoSemEspacosEPontos.length(); i++) {
            pilha2.push(textoSemEspacosEPontos.charAt(i));
        }
        boolean ehPalindromo = true;
        for (int i = 0; i < textoSemEspacosEPontos.length(); i++) {
            if (textoSemEspacosEPontos.charAt(i) != pilha2.pop()) {
                ehPalindromo = false;
                break;
            }
        }
        if (ehPalindromo) {
            System.out.println("O texto é um palíndromo.");
        } else {
            System.out.println("O texto não é um palíndromo.");
        }
    }
}
