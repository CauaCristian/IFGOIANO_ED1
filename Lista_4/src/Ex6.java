import java.util.*;

public class Ex6 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();


        for (int i = 0; i < 1000; i++) {
            int numeroPositivo = (int) (Math.random() * 1000);
            int numeroNegativo = (int) (Math.random() * -1000);
            fila.offer(numeroPositivo);
            fila.offer(numeroNegativo);
        }


        while (!fila.isEmpty()) {
            int numero = fila.poll();
            if (numero > 0) {
                pilha.push(numero);
            } else {
                if (!pilha.isEmpty()) {
                    System.out.println(pilha.pop());
                }
            }
        }
    }
}

