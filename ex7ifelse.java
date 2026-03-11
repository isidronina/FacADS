import java.util.Scanner;

public class ex7ifelse{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, bonus;
        int anos;

        System.out.print("Digite o salário do funcionário: ");
        salario = entrada.nextDouble();

        System.out.print("Digite a quantidade de anos na empresa: ");
        anos = entrada.nextInt();

        if (anos >= 5) {
            bonus = salario * 0.20;
        } else {
            bonus = salario * 0.10;
        }

        System.out.println("O valor do bônus é: " + bonus);

        entrada.close();
    }
}