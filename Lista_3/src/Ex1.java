import java.util.Scanner;
public class Ex1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a, c;
            for (c = 0; c < 3; c++) {
                System.out.print("\n\ndigite numero: ");
                a = sc.nextInt();
                System.out.println("dobro: " + dob(a));
            }
            sc.close();
        }

        public static int dob(int x) {
            return x * 2;
        }
    }





