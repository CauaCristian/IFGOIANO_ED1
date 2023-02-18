import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,d;
        System.out.println("Digite numero de tres casas: ");
        a = scan.nextInt();
        d = a%100 /10;
        System.out.println("algarismo da casa das dezenas: " + d);
        scan.close();
    }
}
