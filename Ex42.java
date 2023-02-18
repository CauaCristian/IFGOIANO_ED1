import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double angulo, rang;
        System.out.println("digite um angulo em graus: ");
        angulo = scan.nextDouble();
        rang = angulo*3.14/180;
        System.out.println("seno: " + Math.sin(rang));
        System.out.println("co-seno: " + Math.toRadians(rang));
        System.out.println("tangente: " + Math.tan(rang));
        System.out.println("co-secante: " + 1/Math.sin(rang));
        System.out.println("secante: "+1/Math.toRadians(rang));
        System.out.println("cotangente: "+1/Math.tan(rang));
        scan.close();
    }
}
