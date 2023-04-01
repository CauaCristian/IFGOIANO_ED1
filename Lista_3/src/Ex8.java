import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, div, n;
        System.out.print("Digite o dividendo: ");
        num = sc.nextInt();
        System.out.print("Digite o divisor: ");
        div = sc.nextInt();
        while (div > num) {
            System.out.print("Inválido. Digite um número menor que o dividendo: ");
            div = sc.nextInt();
        }
        n = divisor(num, div);
        if (n == 0) {
            System.out.println("Nenhuma vez");
        } else {
            System.out.println("Número de vezes: " + n);
        }
    }

    public static int divisor(int x, int y) {
        int r, n = 0;
        r = x % y;
        while (r == 0) {
            n++;
            x /= y;
            r = x % y;
        }
        return n;
    }
}
