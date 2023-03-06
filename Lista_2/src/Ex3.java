import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome[] = new String[5];

        for(int i =0; i<nome.length;i++){
            System.out.println("---------------------------------------");
            System.out.println("digite o nome do aluno");
            System.out.println("---------------------------------------");
            String aluno = scan.nextLine();
            nome[i]= aluno;
        }
        boolean sair = false;
        while(!sair) {
            System.out.println("---------------------------------------");
            System.out.println("Escolha uma operação");
            System.out.println("1 = imprime " + nome[0]);
            System.out.println("2 = imprime " + nome[1]);
            System.out.println("3 = imprime " + nome[2]);
            System.out.println("4 = imprime " + nome[3]);
            System.out.println("5 = imprime " + nome[4]);
            System.out.println("6 = termina o algoritomo");
            System.out.println("---------------------------------------");
            int operaçao = scan.nextInt();
            if (operaçao == 1){
                System.out.println("---------------------------------------");
                System.out.println(nome[0]);
                System.out.println("---------------------------------------");
            }
            if (operaçao == 2){
                System.out.println("---------------------------------------");
                System.out.println(nome[1]);
                System.out.println("---------------------------------------");
            }
            if (operaçao == 3){
                System.out.println("---------------------------------------");
                System.out.println(nome[2]);
                System.out.println("---------------------------------------");
            }
            if (operaçao == 4){
                System.out.println("---------------------------------------");
                System.out.println(nome[3]);
                System.out.println("---------------------------------------");
            }
            if(operaçao == 5){
                System.out.println("---------------------------------------");
                System.out.println(nome[4]);
                System.out.println("---------------------------------------");
            }
            if(operaçao == 6){
                System.out.println("---------------------------------------");
                System.out.println("fim do algoritmo");
                System.out.println("---------------------------------------");
                sair = true;
            }
        }
    }
}
