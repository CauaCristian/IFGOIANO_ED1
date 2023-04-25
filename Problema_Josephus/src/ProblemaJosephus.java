import java.util.Stack;

public class ProblemaJosephus {
    public static void main(String[] args) {
        int n = 20;
        int m = 3;

        Stack<Pessoa> stack = new Stack<>();
        for (int i = n; i >= 1; i--) {
            Pessoa pessoa = new Pessoa(i, "Nome " + i, "Telefone " + i, "Endereço " + i, "CPF " + i);
            stack.push(pessoa);
        }

        int count = 0;
        while (stack.size() > 1) {
            Pessoa pessoa = stack.pop();
            count++;
            if (count % m != 0) {
                stack.push(pessoa);
            }
        }

        Pessoa sobrevivente = stack.pop();
        System.out.println("A pessoa sobrevivente é a de número " + sobrevivente.getNumero());
    }
}

