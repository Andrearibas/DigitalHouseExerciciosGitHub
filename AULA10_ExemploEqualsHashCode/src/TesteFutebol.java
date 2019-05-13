import java.util.HashSet;
import java.util.Set;

public class TesteFutebol {

    public static void main(String[] args) {

        ClubeFutebol botafogo = new ClubeFutebol();
        botafogo.setNome("Botafogo");
        botafogo.setCidade("Rio de Janeiro");
        botafogo.setQuantidadeTorcedor(500);


        ClubeFutebol botafogo2 =new ClubeFutebol();
        botafogo2.setNome("Botafogo");
        botafogo2.setCidade("Rio de Janeiro");
        botafogo2.setQuantidadeTorcedor(600);

        ClubeFutebol flamengo = new ClubeFutebol();
        flamengo.setNome("Flamengo");
        flamengo.setCidade("Rio de Janeiro");
        flamengo.setQuantidadeTorcedor(700);

        if (botafogo.equals(botafogo2)){
            System.out.println("São o mesmo clube");
        }else {
            System.out.println("São clubes diferentes");
        }
        Set<ClubeFutebol> conjuntoClubes = new HashSet<>();

        conjuntoClubes.add(botafogo);
        conjuntoClubes.add(botafogo2);
        conjuntoClubes.add(flamengo);

        System.out.println("Quantidade de clubes: "+conjuntoClubes.size());

        System.out.println(botafogo);
        System.out.println("***********************");
        System.out.println(botafogo2);
        System.out.println("***********************");
        System.out.println(flamengo);



    }

}
