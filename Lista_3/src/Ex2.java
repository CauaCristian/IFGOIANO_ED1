import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3;
        System.out.print("Digite nota 1: ");
        n1 = sc.nextDouble();
        System.out.print("Digite nota 2: ");
        n2 = sc.nextDouble();
        System.out.print("Digite nota 3: ");
        n3 = sc.nextDouble();
        double media = calcularMedia(n1, n2, n3);
        System.out.println("Media aritmetica: " + media);
        sc.close();
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }
}

