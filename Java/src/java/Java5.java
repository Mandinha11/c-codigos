package java;

import java.util.Scanner;

public class Java5 {

	public static void main(String[] args) {

	// Ler (digitado pelo usuário) dois valores (base e altura) de um retângulo e exibir no console a sua área.

	        Scanner  leitura = new Scanner(System.in);

	         Integer area = 0;

	        System.out.println("Digite o nunmero da base:");
	        Integer base = Integer.valueOf(leitura.nextLine());

	        System.out.println("Digite o nunmero da altura:");
	        Integer altura = Integer.valueOf(leitura.nextLine());

	        area = (base*altura)/2;

	        System.out.println(" A area do triangulo: " +area);
	    }
	}
	


