//Ariel Isidro Nina Saavedra

//Construir um algoritmo para ler dois números inteiros:
//e imprimir o seu produto

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro: ");
        int n1= e.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int n2= e.nextInt();
        int produto= n1*n2;
        
        System.out.println("O produto dos dois numeros inteiros é: " +produto);
        
        e.close();
    }    
}
