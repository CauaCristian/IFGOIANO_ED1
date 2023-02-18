import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int data,dia,mes,ano;
        System.out.println("Digite data no formato ddmmaa: ");
        data = scan.nextInt();
        dia = data/10000;
        mes = data%10000 /100;
        ano = data%100;
        System.out.println("dia: " + dia);
        System.out.println("mes: " + mes);
        System.out.println("ano: " + ano);
        scan.close();
    }
}
