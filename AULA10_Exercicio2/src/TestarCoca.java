public class TestarCoca {
    public static void main(String[] args) {

        Coca coca1 = new Coca(46, 9.6);

        Coca coca2 = new Coca(45,6.5);

        if (coca1.equals(coca2)){
            System.out.println("São a mesma Coca");
        }else {
            System.out.println("Não são a mesma Coca");
        }

    }
}
