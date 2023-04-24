import java.util.*;

public class Ex7 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();


        for (int i = 1; i <= 20; i++) {
            fila.offer(i);
        }


        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }
        while (!pilha.isEmpty()) {
            fila.offer(pilha.pop());
        }


        while (!fila.isEmpty()) {
            System.out.print(fila.poll() + " ");
        }
    }
}

