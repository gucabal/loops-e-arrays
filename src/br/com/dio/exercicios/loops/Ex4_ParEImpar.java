package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int count2 = 0;
        int quantPares = 0;
        int quantImpares = 0;


        System.out.println("Digite a quantidade de números a serem inseridos");
        count = scan.nextInt();

        while (count > count2){
            System.out.println("Dgite o número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) quantPares++;
            else quantImpares++;

            count2++;
        }

        System.out.println("Quantidade de números pares: " + quantPares);
        System.out.println("Quantidade de números impares: " + quantImpares);



    }
}
