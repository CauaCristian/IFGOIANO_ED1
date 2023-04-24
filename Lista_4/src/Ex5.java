import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        Queue<Integer> F = new LinkedList<>();
        Stack<Integer> P = new Stack<>();
        Set<Integer> numeros = new HashSet<>();


        for (int i = 0; i < 1000; i++) {
            int numero = (int) (Math.random() * 1000);
            if (numeros.contains(numero)) {
                P.push(numero);
            } else {
                numeros.add(numero);
                F.offer(numero);
            }
        }


        System.out.println("Fila F: " + F);


        System.out.println("Pilha P: " + P);
    }
}

