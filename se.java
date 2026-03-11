import java.util.Scanner;

public class se{
    public static void main (String[]args){
        Scanner e=new Scanner(System.in);
        int resposta;
        System.out.println("digiet um numero: ");
        resposta=e.nextInt();

        if (resposta>=20) {
            System.out.println("o valor dado pela metade e igual a: " +resposta/2);
        }
        else{
            System.out.println("o valor fornecido e menor que 20");
        }

        e.close();

    }
}