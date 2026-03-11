import java.util.Scanner;

public class ex4ifelse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextFloat();

        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextFloat();

        if (num1 > num2) {
            System.out.println("Ordem decrescente: " + num1 + " , " + num2);
        } else {
            System.out.println("Ordem decrescente: " + num2 + " , " + num1);
        }

        entrada.close();
    }
}