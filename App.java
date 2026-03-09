import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do(a) Estudante: ");
        String nome=entrada.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();
        
        System.out.println("Digite a segunada nota: ");
        double nota2 = entrada.nextDouble();
        
        double media= (nota1+nota2)/2;

        System.out.println("Seu nome é " +nome+ " e sua media final é : " +media);

        entrada.close();

    } //fecha o metodo principal
}//facha o Scanner
