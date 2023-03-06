import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        double precocompra[] = new double[100];
        double precovenda[] = new double[100];
        double lucro;
        int totalucromenor10 = 0;
        int totalucromenor20 = 0;
        int totalucromaior20 = 0;
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i <precovenda.length; i++){
            System.out.println("---------------------------------------");
            System.out.println("Preco de compra: ");
            precocompra [i] = scan.nextDouble();
            System.out.println("Preco de venda: ");
            precovenda [i] = scan.nextDouble();
            System.out.println("---------------------------------------");

        }
        for(int i = 0; i <precovenda.length; i++) {

            lucro = (double)(precovenda[i] - precocompra[i]);
            if(lucro<10.0) {
                totalucromenor10++;
            }
            else {
                if(lucro <= 20.0) {
                    totalucromenor20++;
                }
                else {
                    totalucromaior20++;
                }
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("total de mercadorias com lucro < 10%: " + totalucromenor10);
        System.out.println("total de mercadorias com 10% <= lucro " + totalucromenor20);
        System.out.println("total de mercadorias com 20% > lucro " + totalucromaior20);
        System.out.println("---------------------------------------");
    }
}
