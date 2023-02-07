package br.com.dio.exercicios.arrays;

import java.util.Random;
import java.util.Scanner;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[20];
        int numero;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o Numero: ");
            numero = scan.nextInt();
            if (numero <= 100 && numero >= 0) {
                vetor[i] = numero;
            } else {
                System.out.println("Digite outro numero");
                i--;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            int sucessor = vetor[i] + 1;
            System.out.println("numero: " + vetor[i] + " sucessor: " + sucessor);
        }
    }
}