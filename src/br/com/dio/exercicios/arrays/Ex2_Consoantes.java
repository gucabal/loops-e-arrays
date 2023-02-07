package br.com.dio.exercicios.arrays;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        String[] vetor = new String[6];
        int quantConsoantes = 0;
        

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) )  {
                vetor[count] = letra;
                quantConsoantes++;
            }

            count++;

        } while(count < vetor.length);

        System.out.print("Consoantes: ");
        for ( String consoante  :  vetor ) {
            if ( consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantConsoantes);

    }
}
