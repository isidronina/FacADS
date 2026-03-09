//Ariel Isidro Nina Saavedra
//Faça um algoritmo que leia três notas de um aluno:
//calcule e mostre a média aritmética do aluno.

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        double n1=e.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double n2=e.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        double n3=e.nextDouble();

        double media = (n1+n2+n3)/3;
        System.out.println("Sua média final é: "+media);
        e.close();


    }
    
}
