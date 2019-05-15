public class TesteException {
    public static void main(String[] args) {

        System.out.println("Programa inicando");

        try {
            int resultado = 1000/0;
            System.out.println("Resultado: "+resultado);
        } catch (Exception exception){
            System.out.println("Operação inválida");
            System.out.println("Mensagem: "+ exception.getMessage());
        } finally {
            System.out.println("Isso sempre vai acontecer");
        }

        System.out.println("Programa finalizado");
    }
}
