package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int media = 0;


        int count = 0;
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero > maior) maior = numero;
            media = media + numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("O numero maior é " + maior);
        System.out.println("A média é " + (media/5));



    }



}
