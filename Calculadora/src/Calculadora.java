import java.util.Stack;

public class Calculadora {

    public static String converterInfixaParaPosfixa(String expressao) {
        StringBuilder posfixa = new StringBuilder();
        Stack<Character> pilha = new Stack<>();

        for (char caractere : expressao.toCharArray()) {
            if (Character.isDigit(caractere)) {
                posfixa.append(caractere);
            } else if (caractere == '(') {
                pilha.push(caractere);
            } else if (caractere == ')') {
                while (!pilha.isEmpty() && pilha.peek() != '(') {
                    posfixa.append(pilha.pop());
                }
                pilha.pop(); // Remove o '(' da pilha
            } else {
                while (!pilha.isEmpty() && precedencia(caractere) <= precedencia(pilha.peek())) {
                    posfixa.append(pilha.pop());
                }
                pilha.push(caractere);
            }
        }

        while (!pilha.isEmpty()) {
            posfixa.append(pilha.pop());
        }

        return posfixa.toString();
    }

    public static double avaliarPosfixa(String expressao) {
        Stack<Double> pilha = new Stack<>();

        for (char caractere : expressao.toCharArray()) {
            if (Character.isDigit(caractere)) {
                pilha.push((double) (caractere - '0'));
            } else {
                double op2 = pilha.pop();
                double op1 = pilha.pop();

                switch (caractere) {
                    case '+':
                        pilha.push(op1 + op2);
                        break;
                    case '-':
                        pilha.push(op1 - op2);
                        break;
                    case '*':
                        pilha.push(op1 * op2);
                        break;
                    case '/':
                        pilha.push(op1 / op2);
                        break;
                }
            }
        }

        return pilha.pop();
    }

    public static String converterPosfixaParaPrefixa(String expressao) {
        StringBuilder prefixa = new StringBuilder();
        Stack<String> pilha = new Stack<>();

        for (char caractere : expressao.toCharArray()) {
            if (Character.isDigit(caractere)) {
                pilha.push(Character.toString(caractere));
            } else {
                String op2 = pilha.pop();
                String op1 = pilha.pop();
                pilha.push(caractere + op1 + op2);
            }
        }

        prefixa.append(pilha.pop());
        return prefixa.toString();
    }

    public static String converterPosfixaParaInfixa(String expressao) {
        Stack<String> pilha = new Stack<>();

        for (char caractere : expressao.toCharArray()) {
            if (Character.isDigit(caractere)) {
                pilha.push(Character.toString(caractere));
            } else {
                String op2 = pilha.pop();
                String op1 = pilha.pop();
                pilha.push("(" + op1 + caractere + op2 + ")");
            }
        }

        return pilha.pop();
    }

    public static double avaliarPrefixa(String expressao) {
        Stack<Double> pilha = new Stack<>();

        for (int i = expressao.length() - 1; i >= 0; i--) {
            char caractere = expressao.charAt(i);

            if (Character.isDigit(caractere)) {
                pilha.push((double) (caractere - '0'));
            } else {
                double op1 = pilha.pop();
                double op2 = pilha.pop();

                switch (caractere) {
                    case '+':
                        pilha.push(op1 + op2);
                        break;
                    case '-':
                        pilha.push(op1 - op2);
                        break;
                    case '*':
                        pilha.push(op1 * op2);
                        break;
                    case '/':
                        pilha.push(op1 / op2);
                        break;
                }
            }
        }

        return pilha.pop();
    }

    public static String converterPrefixaParaInfixa(String expressao) {
        Stack<String> pilha = new Stack<>();

        for (int i = expressao.length() - 1; i >= 0; i--) {
            char caractere = expressao.charAt(i);

            if (Character.isDigit(caractere)) {
                pilha.push(Character.toString(caractere));
            } else {
                String op1 = pilha.pop();
                String op2 = pilha.pop();
                pilha.push("(" + op1 + caractere + op2 + ")");
            }
        }

        return pilha.pop();
    }

    public static String converterPrefixaParaPosfixa(String expressao) {
        StringBuilder posfixa = new StringBuilder();
        Stack<String> pilha = new Stack<>();

        for (int i = expressao.length() - 1; i >= 0; i--) {
            char caractere = expressao.charAt(i);

            if (Character.isDigit(caractere)) {
                pilha.push(Character.toString(caractere));
            } else {
                String op1 = pilha.pop();
                String op2 = pilha.pop();
                pilha.push(op1 + op2 + caractere);
            }
        }

        posfixa.append(pilha.pop());
        return posfixa.toString();
    }

    public static int precedencia(char operador) {
        if (operador == '+' || operador == '-')
            return 1;
        else if (operador == '*' || operador == '/')
            return 2;
        else
            return 0;
    }
}