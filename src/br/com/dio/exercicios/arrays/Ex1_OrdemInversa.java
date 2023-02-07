package br.com.dio.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {0, 2, 5, 2, 6, 9};
        int count = 0;

        while(count < (vetor.length-1)){
//            System.out.println(vetor[count]);
            count++;
        }

        for(int i=vetor.length - 1; i >=0; i--){
            System.out.println(vetor[i]);
        }



    }
}
