import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Digite um número inteiro maior que 0: ");
        num = sc.nextInt();

        if (primo(num)) {
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo");
        }

        sc.close();
    }

    public static boolean primo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
