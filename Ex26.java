import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int data,dia,mes,ano,ndata;
        System.out.println("Digite data no formato ddmmaa: ");
        data = scan.nextInt();
        dia = data/10000;
        mes = data%10000 /100;
        ano = data%100;
        ndata = mes *10000 + dia * 100 +ano;
        System.out.println("dia: " + dia);
        System.out.println("mes: " + mes);
        System.out.println("ano: " + ano);
        System.out.println("DATA NO FORMATO MMDDAA: " +ndata);
        scan.close();
    }
}
