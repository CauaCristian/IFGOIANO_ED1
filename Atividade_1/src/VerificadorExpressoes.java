import java.util.Scanner;
import java.util.Stack;

public class VerificadorExpressoes {
    public static boolean verificarExpressao(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                if (pilha.isEmpty()) {
                    return false; // Fecha parêntese sem correspondente
                }

                char topo = pilha.pop();

                if ((caractere == ')' && topo != '(') ||
                        (caractere == ']' && topo != '[') ||
                        (caractere == '}' && topo != '{')) {
                    return false; // Parênteses/colchetes/chaves não correspondentes
                }
            }
        }

        return pilha.isEmpty(); // Verifica se todas as aberturas têm fechamento correspondente
    }

}
