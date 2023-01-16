package java;

import java.util.Scanner;

public class Java1 {

	public static void main(String[] args) {
		
        Scanner leitura = new Scanner(System.in);

        Double menor=0.0, maior=0.0;

        Double[] vetor = new Double[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira valor:");
            vetor[i] = Double.valueOf(leitura.nextLine());

            System.out.println(vetor[i]);
            if(i == 0) { 
                maior = vetor[i];
                menor = vetor[i];
            }

            if (vetor[i] > maior) {
                maior = vetor[i];
            }

            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("Maior numero vai ser = "+maior);
        System.out.println("Menor numero vai ser = "+menor);
    }

	}


