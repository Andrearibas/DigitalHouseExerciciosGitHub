public class ExercicioCinco {
    public static void main(String[] args) {

        int [] numeros = {2,5,4,7,6,9};
        double somarPares = 0;
        double somarImpares = 0;

        for (Integer contador = 0; contador < numeros.length; contador++){
            if (numeros[contador]%2==0){
                somarPares = somarPares + numeros[contador];
            }else {
                somarImpares = somarImpares + numeros[contador];
            }
        }
        System.out.println("A soma dos pares é "+somarPares+ "\nA soma dos impares é "+somarImpares);
    }
}
