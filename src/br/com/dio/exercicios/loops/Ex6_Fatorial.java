package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int fatorial = 0;

        System.out.println("Digite o numero para que calcule o fatorial:");
        numero = scan.nextInt();
        fatorial = numero;

        for(int i=numero-1; i>=1; i--){

            fatorial = fatorial * i;

        }
        System.out.println("O fatorial de " + numero + " é = " + fatorial);

    }

}
