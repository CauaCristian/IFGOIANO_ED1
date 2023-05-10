public class Main {
    public static void main(String[] args) {
        ListaEncadeada list = new ListaEncadeada();

// Teste 1
        list.add("Homer");
        list.add("Marge");
        list.printLista(); // imprime "Homer Marge"

// Teste 2
        list.clear();
        list.printLista(); // imprime nada

// Teste 3
        list.add("Homer");
        list.add(0, "Bart");
        list.add(1, "Moll");
        list.printLista(); // imprime "Bart Moll Homer"

// Teste 4
        list.clear();

// Teste 5
        list.add("Homer");
        list.add(0, "Lisa");
        list.add(1, "Bart");
        list.printLista(); // imprime "Lisa Bart Homer"
        System.out.println(list.tamanhoLista()); // imprime "3"

// Teste 6
        list.clear();
        list.printLista(); // imprime nada

// Teste 7
        list.add("Homer");
        list.add("Maggie");
        list.add(0, "Bart");
        list.add(1, "Marge");
        list.printLista(); // imprime "Bart Marge Homer Maggie"
        System.out.println(list.contem("Lisa")); // imprime "false"

// Teste 8

        list.clear();

// Teste 9
        list.add("Homer");
        list.add("Bart");
        list.printLista(); // imprime "Homer Bart"
        System.out.println(list.tamanhoLista()); // imprime "2"

// Teste 10
        list.add("Marge");
        list.add("Maggie");
        System.out.println(list.contem("Marge")); // imprime "true"
        System.out.println(list.contem("Homer")); // imprime "true"
        System.out.println(list.contem("Bart")); // imprime "true"
        System.out.println(list.contem("Maggie")); // imprime "true"
        System.out.println(list.tamanhoLista()); // imprime "4"

// Teste 11
        list.clear();

// Teste 12
        list.addPrimeiro("Bart");
        list.addPrimeiro("Homer");
        list.add(1, "Marge");
        list.add(2, "Maggie");
        list.addPrimeiro("Ned Flanders");
        list.addUltimo("Sr. Burns");
        list.printLista(); // imprime "Ned Flanders Homer Marge Maggie Bart Sr. Burns"

// Teste 13
        list.removeUltimo();
        list.printLista(); // imprime "Ned Flanders Homer Marge Maggie Bart"

// Teste 14
        list.remove(1);
        list.printLista(); // imprime "Ned Flanders Marge Maggie Bart"
        System.out.println(list.tamanhoLista()); // imprime "4"

// Teste 15
        System.out.println(list.contem("Marge")); // imprime "true"
        System.out.println(list.contem("Homer")); // imprime "true"
        System.out.println(list.contem("Bart")); // imprime "true"
        System.out.println(list.contem("Maggie")); // imprime "true"
        System.out.println(list.tamanhoLista()); // imprime "4"

// Teste 16
        list.removePrimeiro();
        list.printLista(); // imprime "Marge Maggie Bart"
        System.out.println(list.tamanhoLista()); // imprime "3"

// Teste 17
        System.out.println(list.contem("Marge")); // imprime "true"
        System.out.println(list.contem("Homer")); // imprime "false"
        System.out.println(list.contem("Bart")); // imprime "true"
        System.out.println(list.contem("Maggie")); // imprime "true"
        System.out.println(list.tamanhoLista()); // imprime "3"
// Teste 18
        list.clear();
        list.printLista(); // imprime nada

    }
}