import java.util.ArrayList;

public class Exercicio2 {
    public static void main(String[] args) {

        try {

            ArrayList<String> animal = null;

            animal.add("Pato");
            animal.add("Cachorro");
            animal.add("Gato");

            System.out.println(animal.get(2));

        } catch (Exception exception ){
            System.out.println("Operação inválida");
            System.out.println("Mensagem: "+exception.getMessage());
        }

    }
}
