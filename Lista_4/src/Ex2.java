import java.util.Scanner;
import java.util.Stack;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Stack<Integer> pilha = new Stack<>();
        pilha.push(5);
        pilha.push(3);
        pilha.push(1);
        pilha.push(2);
        pilha.push(4);


        System.out.print("Digite a chave do item a ser removido: ");
        int chave = scanner.nextInt();


        Stack<Integer> auxiliar = new Stack<>();
        while (!pilha.isEmpty()) {
            int item = pilha.pop();
            if (item != chave) {
                auxiliar.push(item);
            }
        }
        while (!auxiliar.isEmpty()) {
            pilha.push(auxiliar.pop());
        }


        System.out.println("Pilha resultante:");
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
    }
}
