import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
      
        System.out.println("Digite um numero maior que 20");
        double n1= e.nextDouble();


        if(n1>20){
            System.out.println("a metade do numero digitado é: "+n1/2);
        }
        
    }
}
