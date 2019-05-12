public class Exercicio1 {
    public static void main(String[] args) {

        Integer umNumeroA = 15;
        Integer umNumeroB = 22;
        Integer umNumeroC = 5;

        if (umNumeroA>umNumeroB && umNumeroA>umNumeroC){
            System.out.println("O numero maior dos três é: "+umNumeroA);
        }else if (umNumeroB>umNumeroA && umNumeroB>umNumeroC){
            System.out.println("O numero maior dos três é: "+umNumeroB);
        }else {
            System.out.println("O numero maior dos três é: "+umNumeroC);
        }
    }
}
