public class ExercicioQuatro {
    public static void main(String[] args) {

        Integer arrays[] = {2,5,7,9};
        Integer soma = 0;

        for(Integer contado = 0; contado < arrays.length; contado++){
            soma = soma + arrays[contado];
        }
        System.out.println(soma);
    }
}
