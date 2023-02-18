import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        double sm, qtdade, preco, vp, vd;
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com o salario minimo:");
        sm = scan.nextDouble();
        System.out.println("entre com a quantidade em quilowatt");
        qtdade = scan.nextDouble();
        preco = sm/700;
        vp = preco * qtdade;
        vd = vp * 0.9;
        System.out.println("preco do quilowatt:"+ preco + "\n valor a ser pago: "+vp);
        System.out.println("valor com desconto:"+vd);
        scan.close();
    
    }
}
