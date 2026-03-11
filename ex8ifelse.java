import java.util.Scanner;

public class ex8ifelse{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senha;

        System.out.print("Digite a senha: ");
        senha = entrada.nextLine();

        if (senha.equals("R10p5")) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }

        entrada.close();
    }
}