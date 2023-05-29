import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class ExDEQUE {
    public static void main(String[] args) {
        Deque<Pessoa> filaAtendimento = new ArrayDeque<>();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int idade = random.nextInt(90) + 10; // idade entre 10 e 99
            boolean gestante = random.nextBoolean();
            boolean lactante = random.nextBoolean();
            boolean necessidadeEspecial = random.nextBoolean();
            String sexo = random.nextBoolean() ? "Masculino" : "Feminino";
            Pessoa pessoa = new Pessoa(i + 1, sexo, idade, gestante, lactante, necessidadeEspecial);
            filaAtendimento.add(pessoa);
        }

        Deque<Pessoa> atendimentosRealizados = new ArrayDeque<>();
        Deque<Pessoa> pessoasNaoAtendidas = new ArrayDeque<>();

        int grupo = 1;
        int atendidosNoGrupo = 0;

        while (!filaAtendimento.isEmpty() && atendimentosRealizados.size() < 100) {
            Pessoa pessoa = filaAtendimento.poll();

            if (pessoa.getPrioridade() >= atendidosNoGrupo) {
                atendimentosRealizados.add(pessoa);
                atendidosNoGrupo++;

                if (atendidosNoGrupo > grupo) {
                    grupo++;
                    atendidosNoGrupo = 0;
                }
            } else {
                pessoasNaoAtendidas.add(pessoa);
            }
        }

        System.out.println("Atendimentos realizados:");

        for (Pessoa pessoa : atendimentosRealizados) {
            System.out.println(pessoa);
        }

        System.out.println("\nPessoas não atendidas:");

        for (Pessoa pessoa : pessoasNaoAtendidas) {
            System.out.println(pessoa);
        }
    }
}
