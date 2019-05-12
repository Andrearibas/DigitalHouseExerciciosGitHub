public class Exercicio5 {
    public static void main(String[] args) {

        Integer umNumeroA = 20;
        Integer umNumeroB = 96;
        Integer umNumeroC = 32;
        Integer umNumeroD = 45;

        if (umNumeroA>umNumeroC && umNumeroA>umNumeroD || umNumeroB>umNumeroC && umNumeroB>umNumeroD){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
