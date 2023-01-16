package java;

import java.util.Scanner;

public class Java {

	public static void main(String[] args) {

		Scanner  leitura = new Scanner(System.in);


        System.out.println("Digite um numero:");
        Integer numero = Integer.valueOf(leitura.nextLine());

        System.out.println("Digite um numero:");
        Integer numero2 = Integer.valueOf(leitura.nextLine());

        System.out.println("Digite um numero:");
        Integer numero3 = Integer.valueOf(leitura.nextLine());

        if(numero2 < numero || numero > numero3) {
            System.out.println("Maior numero digitado e: "+numero);
        }

        if(numero < numero2 ||  numero2 > numero3) {
            System.out.println("Maior numero digitado e: "+numero2);
        }

        if(numero < numero3 || numero3 > numero2) {
            System.out.println("Maior numero digitado e: "+numero3);
        }

    }

	}


