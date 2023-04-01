import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();
        verifica(num1, num2);
        sc.close();
    }

    public static void verifica(int num1, int num2) {
        if (num1 < num2) {
            System.out.println(num2 + " é maior.");
        } else {
            System.out.println(num1 + " é maior.");
        }
    }
}
