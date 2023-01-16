package java;

import java.util.Scanner;

public class Java9 {

	public static void main(String[] args) {

		 Scanner leitura = new Scanner(System.in);

	        String[] vetor = new String[10];
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.println("Insira valor:");
	            vetor[i] = leitura.nextLine();
	        }

	        vetor[0] = "valor";
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.println(vetor[i]);
	        }
	    }
	
	}


