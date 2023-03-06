import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome[] = new String[5];
        double nota1[] = new double[5];
        double nota2[] = new double[5];
        double media[] = new double[5];
        for(int i =0; i<nome.length;i++){
            System.out.println("---------------------------------------");
            System.out.println("digite o nome do aluno(a)");
            System.out.println("---------------------------------------");
            String aluno = scan.nextLine();
            nome[i]= aluno;
        }
        for(int i=0; i< nome.length;i++){
            System.out.println("---------------------------------------");
            System.out.println("digite a nota 1 do(a) " + nome[i]);
            System.out.println("---------------------------------------");
            double nota_1 = scan.nextDouble();
            nota1[i]= nota_1;
            System.out.println("---------------------------------------");
            System.out.println("digite a nota 2 do(a) " + nome[i]);
            System.out.println("---------------------------------------");
            double nota_2 = scan.nextDouble();
            nota2[i]= nota_2;
            media[i] = ((nota1[i] + nota2[i])/2);


        }
        for(int i=0; i< nome.length;i++){
            System.out.println("---------------------------------------");
            System.out.println("a media do aluno: " + nome[i] + " é " + media[i]);
            System.out.println("---------------------------------------");
        }
        scan.close();
    }
}
