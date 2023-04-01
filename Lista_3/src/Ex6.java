import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double logaritmando, base, resultado;
        int c;

        for (c = 1; c <= 3; c++) {
            System.out.print("\nDigite o logaritmando maior do que 0: ");
            logaritmando = sc.nextDouble();

            while (logaritmando <= 0) {
                System.out.print("\nInválido. Digite o logaritmando maior do que 0: ");
                logaritmando = sc.nextDouble();
            }

            System.out.print("\nDigite a base maior do que 0 e diferente de 1: ");
            base = sc.nextDouble();

            while (base <= 0 || base == 1) {
                System.out.print("\nInválido. Digite a base maior do que 0 e diferente de 1: ");
                base = sc.nextDouble();
            }

            resultado = loga(logaritmando, base);
            System.out.printf("\nLogaritmo é %.5f\n", resultado);
        }

        sc.close();
    }

    public static double loga(double base, double expo) {
        return Math.log(base) / Math.log(expo);
    }
}
