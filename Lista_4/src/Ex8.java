import java.util.Random;
import java.util.Stack;

public class Ex8 {
    private Stack<Integer> P;
    private Stack<Integer> N;

    public Ex8() {
        P = new Stack<Integer>();
        N = new Stack<Integer>();
    }

    public void inserir(int valor) {
        if (valor > 0) {
            P.push(valor);
        } else if (valor < 0) {
            N.push(valor);
        } else {
            if (!P.empty()) {
                int p = P.pop();
                System.out.println("Pilha P: " + p);
            }
            if (!N.empty()) {
                int n = N.pop();
                System.out.println("Pilha N: " + n);
            }
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        Ex8 tp = new Ex8();

        for (int i = 0; i < 1000; i++) {
            int num = r.nextInt(201) - 100;
            tp.inserir(num);
        }
    }
}

