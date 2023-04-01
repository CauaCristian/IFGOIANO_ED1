import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letra = sc.nextLine().toUpperCase();
        if (ehConsoante(letra)) {
            System.out.println("É uma consoante.");
        } else {
            System.out.println("Não é uma consoante.");
        }
    }

    public static boolean ehConsoante(String letra) {
        String[] consoantes = {"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
        for (String c : consoantes) {
            if (letra.equals(c)) {
                return true;
            }
        }
        return false;
    }
}
