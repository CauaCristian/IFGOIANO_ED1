import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quoc,rest,val1,val2;
        System.out.println("nentre com o dividendo: ");
        val1 = scan.nextInt();
        System.out.println("nentre com o divisor: ");
        val2 = scan.nextInt();
        quoc = val1/val2;
        rest = val1%val2;
        System.out.println("dividendo: " + val1);
        System.out.println("divisor: " + val2);
        System.out.println("quociente: " + quoc);
        System.out.println("resto: " + rest);
        scan.close();
    }
}
