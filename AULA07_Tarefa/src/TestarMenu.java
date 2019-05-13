import java.util.Scanner;

public class TestarMenu {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int numeroA;

        System.out.println("Digite um numero:");
        numeroA = numero.nextInt();


        Scanner numero1 = new Scanner(System.in);
        int numeroB;

        System.out.println("Digite outro numero:");
        numeroB = numero1.nextInt();


        Scanner scanner = new Scanner(System.in);
        int menu;


        System.out.println("Digite a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.println("5 - Sair");

        menu = scanner.nextInt();

        int resultado;

        if (menu ==1){
           resultado = numeroA + numeroB;
            System.out.println(resultado);
        }else if(menu==2){
            resultado = numeroA - numeroB;
            System.out.println(resultado);
        }else if(menu==3){
            resultado = numeroA/numeroB;
            System.out.println(resultado);
        }else if(menu==4){
            resultado = numeroA*numeroB;
            System.out.println(resultado);
        }else {
            int i = 0;
            System.exit(i);
        }


    }
}
