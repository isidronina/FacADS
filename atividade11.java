import java.util.Scanner;

public class atividade11 {
    public static void main (String[]args){
        Scanner e=new Scanner(System.in);
        System.err.println("insira o ano atual:");
        int anot=e.nextInt();
        System.out.println("insira o ano de nacimento: ");
        int anoC=e.nextInt();
        int idade =anot-anoC;
        int idade_2030 = 2030-anoC;
        System.out.println("idade " +idade+ "idade em 2030 " +idade_2030);


    }

}