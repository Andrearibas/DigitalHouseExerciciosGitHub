public class TestarPessoa {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Andrea", 1234567);

        Pessoa pessoa2 = new Pessoa("Andrea", 1234567);

        if (pessoa1.equals(pessoa2)){
            System.out.println("São a mesma Pessoa");
        }else {
            System.out.println("Não são as mesma Pessoa");
        }

    }
}
