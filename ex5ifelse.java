import java.util.Scanner;

public class ex5ifelse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = entrada.nextInt();

        if (numero >= 50 && numero <= 100) {
            System.out.println("Pertence ao intervalo");
        } else {
            System.out.println("Não pertence ao intervalo");
        }

        entrada.close();
    }
}