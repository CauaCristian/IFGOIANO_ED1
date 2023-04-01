import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angulo, graus;
        System.out.print("Digite o angulo em radianos: ");
        angulo = sc.nextDouble();
        graus = converterParaGraus(angulo);
        System.out.printf("%.2f radianos = %.2f graus\n", angulo, graus);
        sc.close();
    }

    public static double converterParaGraus(double angulo) {
        double graus = angulo * 180 / Math.PI;
        return graus;
    }

}




