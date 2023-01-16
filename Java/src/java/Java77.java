package java;

import java.util.Scanner;

public class Java77 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner (System.in);

        String[] lista  = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o nome: ");

            lista[i] = leitura.nextLine();


    }

        for (int i = 0; i < 10; i++) {
              System.out.println(lista[i]);

        }

        System.out.println(lista.length);


    }


    
	

}
