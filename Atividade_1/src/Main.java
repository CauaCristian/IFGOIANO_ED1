import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VerificadorExpressoes verificadorExpressoes = new VerificadorExpressoes();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a expressão: ");
        String expressao = scanner.nextLine();

        if (verificadorExpressoes.verificarExpressao(expressao)) {
            System.out.println("Expressão correta!");
        } else {
            System.out.println("Expressão incorreta!");
        }
    }
}