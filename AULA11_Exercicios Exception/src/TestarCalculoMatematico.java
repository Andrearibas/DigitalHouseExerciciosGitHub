public class TestarCalculoMatematico {
    public static void main(String[] args) {

        CalculoMatematico calculo = new CalculoMatematico();

        try {
            System.out.println(calculo.divisao(4,0));
        } catch (ArithmeticException arithmeticException){
            System.out.println("Operação invalida");
            System.out.println("Mensagem: "+arithmeticException.toString());
        }

    }
}
