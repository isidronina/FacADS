//Ariel Isidro Nina Saavedra
//Faça um algoritmo que leia quatro números inteiros.
//calcule e mostre a soma desses números.


import java.util.Scanner;

public class atividade3{
    public static void main(String[]args){
        Scanner e = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int n1= e.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int n2= e.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int n3= e.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int n4= e.nextInt();

        int soma= n1+n2+n3+n4;

        System.out.println("a soma dos numeros inteiros é:" +soma);
        e.close();

    }

}
