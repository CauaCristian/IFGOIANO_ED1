import java.util.LinkedList;
import java.util.Queue;

public class Ex4 {
    public static void main(String[] args) {

        Queue<Integer> F1 = new LinkedList<>();
        for (int i = 1; i <= 100; i++) {
            F1.offer((int) (Math.random() * 100));
        }


        Queue<Integer> F2 = inverteFila(F1);


        System.out.println("Fila F1: " + F1);
        System.out.println("Fila F2: " + F2);
    }

    public static Queue<Integer> inverteFila(Queue<Integer> F1) {

        Queue<Integer> F2 = new LinkedList<>();


        while (!F1.isEmpty()) {
            int elemento = F1.poll();
            F2.offer(elemento);
        }

        return F2;
    }
}

