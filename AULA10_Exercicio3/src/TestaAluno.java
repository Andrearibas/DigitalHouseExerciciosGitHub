import java.util.ArrayList;
import java.util.List;

public class TestaAluno {
    public static void main(String[] args) {


        Aluno aluno1 = new Aluno("Andrea",123456);
        Aluno aluno2 = new Aluno("Joao",234567);
        Aluno aluno3 = new Aluno("Maria", 3456789);
        Aluno aluno4 = new Aluno("Jose", 4567890);

        Aluno aluno5 = new Aluno("Fernando", 123456);

        List<Aluno> aluno = new ArrayList<>();
        aluno.add(aluno1);
        aluno.add(aluno2);
        aluno.add(aluno3);
        aluno.add(aluno4);
        aluno.add(aluno5);

        for (Aluno alun : aluno){
            aluno.contains(aluno5);
        }

    }
}
