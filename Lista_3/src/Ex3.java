import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angulo, radiano;
        System.out.print("Digite o angulo em graus: ");
        angulo = sc.nextDouble();
        radiano = converterParaRadianos(angulo);
        System.out.printf("%.2f graus = %.2f radianos\n", angulo, radiano);
        sc.close();
    }

    public static double converterParaRadianos(double angulo) {
        double radiano = angulo * Math.PI / 180;
        return radiano;
    }
}
