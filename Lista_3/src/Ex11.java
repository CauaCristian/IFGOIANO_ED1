import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, base, c;
        System.out.print("Digite um número maior ou igual a 0: ");
        num = input.nextInt();
        while (num < 0) {
            System.out.print("Número negativo. Digite um número maior ou igual a 0: ");
            num = input.nextInt();
        }
        System.out.print("Digite a base em que deseja representá-lo (2-10): ");
        base = input.nextInt();
        while (base < 2 || base > 10) {
            System.out.print("Não sei converter. Digite a base em que deseja representá-lo (2-10): ");
            base = input.nextInt();
        }
        c = converte(num, base);
        System.out.println("\nNúmero em decimal: " + num);
        System.out.println("Número na base " + base + ": " + c);
    }

    public static int converte(int nnum, int nbase) {
        int nb = 0, r, b = 0;
        while (nnum >= nbase) {
            r = nnum % nbase;
            nb += Math.pow(10, b) * r;
            nnum = nnum / nbase;
            b++;
        }
        nb += Math.pow(10, b) * nnum;
        return nb;
    }
}
