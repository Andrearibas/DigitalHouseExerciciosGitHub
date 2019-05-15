public class CalculoMatematico {

    public double divisao (int dividemdo, int divisor) throws ArithmeticException {
        if (divisor == 0)
            throw new ArithmeticException("Não é possivel dividir o numero por 0");

        return dividemdo/divisor;

    }

}
