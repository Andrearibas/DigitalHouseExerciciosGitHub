import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Livraria {

    private Map<String,Livro> estoque;
    private List<ColecaoDeLivros> colecao;


    public Livraria(){

        estoque = new HashMap<>();
        Livro l1 = new Livro();
        l1.setCodigo("ABC25914");
        l1.setTitulo("A Cabana");
        l1.setAutor("Young,William P.");
        l1.setAnoLancamento(1992);
        l1.setCogigoISBN("2591423");
        l1.setPreco(23.54F);
        l1.setQuantidadeEstoque(5);

        Livro l2 = new Livro();
        l2.setCodigo("DEF10502");
        l2.setTitulo("Prisioneiros da Mente");
        l2.setAutor("Augusto Cury");
        l2.setAnoLancamento(1987);
        l2.setCogigoISBN("10502037");
        l2.setPreco(20.90F);
        l2.setQuantidadeEstoque(7);

        Livro l3 = new Livro();
        l3.setCodigo("GHI97387");
        l3.setTitulo("Harry Potter e A Câmara Secreta");
        l3.setAutor("Rowling,J. K");
        l3.setAnoLancamento(1972);
        l3.setCogigoISBN("9738751");
        l3.setPreco(24.90F);
        l3.setQuantidadeEstoque(6);

        Livro l4 = new Livro();
        l4.setCodigo("JKL26440");
        l4.setTitulo("Amanhecer");
        l4.setAutor("Meyer,Stephenie");
        l4.setAnoLancamento(2015);
        l4.setCogigoISBN("2644004");
        l4.setPreco(39.45F);
        l4.setQuantidadeEstoque(2);

        estoque.put(l1.getCodigo(), l1);
        estoque.put(l2.getCodigo(),l2);
        estoque.put(l3.getCodigo(),l3);
        estoque.put(l4.getCodigo(),l4);

        colecao = new ArrayList<>();
        ColecaoDeLivros colecao1 = new ColecaoDeLivros();
        colecao1.setCodigo("CBA1004898143");
        colecao1.setDescricao("Combo 3 Volumes 'Como Eu Era Antes de Você' ");
        colecao1.setPreco(70.9F);

        ColecaoDeLivros colecao2 = new ColecaoDeLivros();
        colecao2.setCodigo("CAB1002453546");
        colecao2.setDescricao("Combo 4 Volumes 'As Crônicas de Amor e Ódio' ");
        colecao2.setPreco(95.9F);

        ColecaoDeLivros colecao3 = new ColecaoDeLivros();
        colecao3.setCodigo("CAA1009738750");
        colecao3.setDescricao("Combo 7 Volumes 'Harry Potter ' ");
        colecao3.setPreco(269.70F);

        colecao.add(colecao1);
        colecao.add(colecao2);
        colecao.add(colecao3);
    }

    public void cadastrarLivro(Livro produto){
        estoque.put(produto.getCodigo(),produto);
        System.out.println("*****************************");
        System.out.println("Livro cadastrado com sucesso!");
        System.out.println("*****************************");

    }

    public void cadastrarColecao(ColecaoDeLivros item) {
        colecao.add(item);
        System.out.println("*****************************");
        System.out.println("Coleção de Livros cadastrado com sucesso!");
        System.out.println("*****************************");
    }

    public void consultaLivro(String codigo){

        Livro livro = estoque.get(codigo);


        if (livro == null){
            System.out.println("Livro não encontrado!");
            System.out.println("*****************************");
        } else {
            System.out.println(livro);
            System.out.println("*****************************");
        }

    }




    public void efetuarVenda(String codigo){

        try {
            Livro livro = estoque.get(codigo);
            if ( livro.getQuantidadeEstoque() < 0){
                System.out.println("Livro sem estoque!");
                System.out.println("*****************************");
            } else {
                livro.setQuantidadeEstoque(livro.getQuantidadeEstoque()- 1);
                System.out.println("Venda realizada com sucesso!");
                System.out.println("Estoque atual: "+livro.getQuantidadeEstoque());
                System.out.println("*****************************");
            }

        }catch (NullPointerException e){
            System.out.println("Livro não encontrado");
            System.out.println("*****************************");

        }

    }


}

