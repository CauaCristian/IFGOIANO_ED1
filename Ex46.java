import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        double saldo, nsaldo;
        Scanner scan = new Scanner(System.in);
        System.out.println("digite saldo:");
        saldo = scan.nextDouble();
        nsaldo = saldo * 1.01;
        System.out.println("novo saldo:" + nsaldo);
        scan.close();
    }
}
