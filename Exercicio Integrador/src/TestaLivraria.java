import java.util.Scanner;

public class TestaLivraria {
    public static void main(String[] args) {

        Livraria livraria = new Livraria();

        Livro l5 = new Livro();
        l5.setCodigo("JHB10509");
        l5.setTitulo("O Poder Oculto");
        l5.setAutor("Manzotti,Reginaldo");
        l5.setAnoLancamento(1988);
        l5.setCogigoISBN("10509058");
        l5.setPreco(52.6F);
        l5.setQuantidadeEstoque(5);

        ColecaoDeLivros colecao4 = new ColecaoDeLivros();
        colecao4.setCodigo("TESTE");
        colecao4.setDescricao("Combo 4 Volumes 'TESTE' ");
        colecao4.setPreco(95.9F);


        livraria.cadastrarLivro(l5);

        livraria.cadastrarColecao(colecao4);

        livraria.consultaLivro(l5.getCodigo());

        livraria.efetuarVenda("JHBG1112113");

        livraria.efetuarVenda("JBGH98643");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o codigo do livro desejado: ");
        String codigoDigitaldo = scanner.next();
        livraria.efetuarVenda(codigoDigitaldo);

    }
}
