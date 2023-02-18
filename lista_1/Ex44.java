import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        double num, base, logaritmo;
        Scanner scan = new Scanner(System.in);
        num = scan.nextDouble();
        System.out.println("entre com a base :");
        base = scan.nextDouble();
        logaritmo = Math.log(num)/Math.log(base);
        System.out.println("logaritmo deb"+ num + "bna baseb"+"be:b"+logaritmo );
        scan.close();
    }
}
