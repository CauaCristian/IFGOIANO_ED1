import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("digite uma frase");
        String frase = scan.nextLine();
        boolean sair = false;

        while(!sair) {
            System.out.println("---------------------------------------");
            System.out.println("Escolha uma operação");
            System.out.println("1 = imprime o comprimento");
            System.out.println("2 = imprime os dois primeiro e os dois ultimos caracteres");
            System.out.println("3 = imprime a frase espelhada");
            System.out.println("4 = termina o algoritomo");
            System.out.println("---------------------------------------");
            int operaçao = scan.nextInt();
            if (operaçao == 1){
                System.out.println("---------------------------------------");
                System.out.println("a frase e de tamanho de " + frase.length() + " caracteres");
                System.out.println("---------------------------------------");
            }
            if (operaçao == 2){
                System.out.println("---------------------------------------");
                System.out.println("os dois primeiros caracteres da sua frase sao: " + frase.charAt(0) + " " + frase.charAt(1));
                System.out.println("os dois ultimo caracteres da sua frase sao: " + frase.charAt(((frase.length())-2)) + " " + frase.charAt(((frase.length())-1)));
                System.out.println("---------------------------------------");
            }
            if (operaçao == 3){
                System.out.println("---------------------------------------");
                System.out.println(new StringBuilder(frase).reverse().toString());
                System.out.println("---------------------------------------");
            }
            if (operaçao == 4){
                System.out.println("---------------------------------------");
                System.out.println("fim do algoritmo");
                System.out.println("---------------------------------------");
                sair = true;
            }

        }
    }
}

