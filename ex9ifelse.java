import java.util.Scanner;

public class ex9ifelse{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, prestacao;

        System.out.print("Digite o salário bruto: ");
        salario = entrada.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        prestacao = entrada.nextDouble();

        if (prestacao <= salario * 0.30) {
            System.out.println("Empréstimo pode ser concedido!");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }

        entrada.close();
    }
}