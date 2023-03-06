import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        int ultimodia []  = new int[12];
        String signo[] = new String[12];
        int data;
        int dia;
        int mes;
        Scanner scan = new Scanner(System.in);

        for (int i= 0; i< signo.length; i++) {
            System.out.println("---------------------------------------");
            System.out.println("digite um signo: ");
            signo[i] = scan.nextLine();
            System.out.println("---------------------------------------");

        }
        for (int i= 0; i< ultimodia.length; i++) {
            System.out.println("---------------------------------------");
            System.out.println("digite o ultimo dia do signo " + signo[i] + ":");
            ultimodia [i] = scan.nextInt();
            System.out.println("---------------------------------------");

        }
        System.out.println("---------------------------------------");
        System.out.println("digite data no formato ddmm ou 9999 para terminar:");
        System.out.println("---------------------------------------");
        data = scan.nextInt();


        while(data != 9999){

            dia = data / 100;
            mes = data % 100;
            mes--;

            if(dia > ultimodia [mes]){

                mes = (mes+ 1) %12;

            }
            System.out.println("---------------------------------------");
            System.out.println("signo: " + signo[mes]);
            System.out.println("---------------------------------------");
            System.out.println("digite data no formato ddmm ou 9999 para terminar:");
            data = scan.nextInt();
            System.out.println("---------------------------------------");

        }
    }
}
