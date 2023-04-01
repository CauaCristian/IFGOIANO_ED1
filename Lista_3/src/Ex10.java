import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        int x = reverso(num);
        System.out.print(num + " - " + x);

        if (x == num) {
            System.out.println("\nÉ um número capicua.");
        } else {
            System.out.println("\nNão é um número capicua.");
        }
    }

    public static int reverso(int num) {
        int soma = 0;
        while (num != 0) {
            int r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
        }
        return soma;
    }
}

