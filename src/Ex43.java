import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num, logaritmo;
        System.out.println("entre com o logaritmando: ");
        num = scan.nextDouble();
        logaritmo = Math.log(num) / Math.log(10);
        System.out.println("logaritmo: " + logaritmo);
        scan.close();
    }
}
