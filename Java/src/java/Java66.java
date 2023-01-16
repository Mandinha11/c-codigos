package java;

import java.util.Scanner;

public class Java66 {

	public static void main(String[] args) {

	     //leitura de daods - declarar apenas 1 vez
        Scanner leitura = new Scanner(System.in); //Nunca fazer em um for só usar uma vez

        String nome = leitura.nextLine();
        Integer idade = Integer.valueOf(leitura.nextLine());

        System.out.println(nome);
        System.out.println(idade);

    }

}
	
