import java.util.Scanner;

public class InverterPalavras {
    public static void main(String[] args) {
        System.out.println("digite uma frase: ");
        Scanner scan = new Scanner(System.in);
        String input =  scan.nextLine();
        String[] palavras = input.split(" ");
        Pilha pilha = new Pilha();
        StringBuilder output = new StringBuilder();

        for (String palavra : palavras) {
            for (char c : palavra.toCharArray()) {
                pilha.push(c);
            }

            while (!pilha.isEmpty()) {
                output.append(pilha.pop());
            }

            output.append(" ");
        }

        System.out.println(output.toString().trim());
    }
}
