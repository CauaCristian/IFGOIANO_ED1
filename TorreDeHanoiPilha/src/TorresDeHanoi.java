import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Stack;

public class TorresDeHanoi {
    private Stack<Integer>[] torres;
    private int numDiscos;
    private int numMovimentos;
    private LocalDateTime inicio;
    private LocalDateTime fim;

    public TorresDeHanoi(int numDiscos) {
        this.numDiscos = numDiscos;
        this.torres = new Stack[3];
        for (int i = 0; i < 3; i++) {
            this.torres[i] = new Stack<>();
        }
        for (int i = numDiscos; i >= 1; i--) {
            this.torres[0].push(i);
        }
        this.numMovimentos = 0;
    }

    public void jogar() {
        this.inicio = LocalDateTime.now();
        moverDiscos(numDiscos, 0, 1, 2);
        this.fim = LocalDateTime.now();
    }

    private void moverDiscos(int numDiscos, int torreOrigem, int torreDestino, int torreAuxiliar) {
        if (numDiscos == 1) {
            int disco = this.torres[torreOrigem].pop();
            this.torres[torreDestino].push(disco);
            this.numMovimentos++;
            System.out.println("Movimento " + numMovimentos + ": mover disco " + disco + " da torre " + (torreOrigem + 1) + " para a torre " + (torreDestino + 1));
        } else {
            moverDiscos(numDiscos - 1, torreOrigem, torreAuxiliar, torreDestino);
            moverDiscos(1, torreOrigem, torreDestino, torreAuxiliar);
            moverDiscos(numDiscos - 1, torreAuxiliar, torreDestino, torreOrigem);
        }
    }

    public void imprimirResultado() {
        System.out.println("Tempo gasto: " + formatarDuracao(Duration.between(inicio, fim)));
        System.out.println("Número de movimentos: " + numMovimentos);
    }

    private String formatarDuracao(Duration duracao) {
        long horas = duracao.toHours();
        long minutos = duracao.toMinutes() % 60;
        long segundos = duracao.getSeconds() % 60;
        long milissegundos = duracao.toMillis() % 1000;
        return String.format("%02d:%02d:%02d:%04d", horas, minutos, segundos, milissegundos);
    }

    public static void main(String[] args) {
        TorresDeHanoi jogo = new TorresDeHanoi(20);
        jogo.jogar();
        jogo.imprimirResultado();
    }
}

