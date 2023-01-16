package java;

import java.util.Scanner;

public class Java3 {

	public static void main(String[] args) {
		//Ler um número (digitado pelo usuário) e exibir no console o seu sucessor

		  Scanner  leitura = new Scanner(System.in);

	        Integer numero = 0;

	        System.out.println("Digite um numero");
	        Integer num = Integer.valueOf(leitura.nextLine());

	        numero = num + 1;

	        System.out.println(" O seu sucessor do numero digitado é: " +numero);


	           }

	
	

}
