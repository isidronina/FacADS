import java.util.Scanner;

public class ex10ifelse{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        num3 = entrada.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Os números são iguais");
        } else {
            int maior = num1;

            if (num2 > maior) {
                maior = num2;
            }

            if (num3 > maior) {
                maior = num3;
            }

            System.out.println("O maior número é: " + maior);
        }

        entrada.close();
    }
}