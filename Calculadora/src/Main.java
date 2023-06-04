public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        String expressao = "( 3 + 4 ) * 5";
        String tipoNotacao = "infixa";

        if (tipoNotacao.equals("infixa")) {
            String posfixa = calculadora.converterInfixaParaPosfixa(expressao);
            double resultado = calculadora.avaliarPosfixa(posfixa);
            String prefixa = calculadora.converterPosfixaParaPrefixa(posfixa);

            System.out.println("Expressão em notação infixa: " + expressao);
            System.out.println("Expressão em notação pós-fixa: " + posfixa);
            System.out.println("Expressão em notação pré-fixa: " + prefixa);
            System.out.println("Resultado: " + resultado);
        } else if (tipoNotacao.equals("posfixa")) {
            double resultado = calculadora.avaliarPosfixa(expressao);
            String infixa = calculadora.converterPosfixaParaInfixa(expressao);
            String prefixa = calculadora.converterPosfixaParaPrefixa(expressao);

            System.out.println("Expressão em notação pós-fixa: " + expressao);
            System.out.println("Expressão em notação infixa: " + infixa);
            System.out.println("Expressão em notação pré-fixa: " + prefixa);
            System.out.println("Resultado: " + resultado);
        } else if (tipoNotacao.equals("prefixa")) {
            double resultado = calculadora.avaliarPrefixa(expressao);
            String infixa = calculadora.converterPrefixaParaInfixa(expressao);
            String posfixa = calculadora.converterPrefixaParaPosfixa(expressao);

            System.out.println("Expressão em notação pré-fixa: " + expressao);
            System.out.println("Expressão em notação infixa: " + infixa);
            System.out.println("Expressão em notação pós-fixa: " + posfixa);
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Tipo de notação inválido!");
        }
    }
}
