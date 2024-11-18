package exercicios;

import java.util.Scanner;

public class Exercicios {

    public void exercicioUm() {
        //Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        //e armazene-os num vetor. Em seguida, mostrar na tela todos os números negativos lidos.

        System.out.println("Quantos numeros voce vai digitar?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 10) {
            System.out.println("o número digitado não pode ser maior que 10.");
            return;
        } else if (n <= 0) {
            System.out.println("o número digitado não pode ser menor que 0.");
            return;
        }

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int countNegativos = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i] < 0){
                countNegativos++;
            }
        }

        int[] negativos = new int[countNegativos];
        int index = 0;

        for (int i = 0 ; i < n ; i++){
            if (vect[i] < 0){
                negativos[index] = vect[i];
                index++;
            }
        }

        for (int negativo : negativos) {
            System.out.println(negativo);
        }

    }
}
