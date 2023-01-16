package java;

import java.util.ArrayList;
import java.util.Scanner;

public class Java11 {

	public static void main(String[] args) {

	     ArrayList<String> listaNumeros = new ArrayList<>();
         @SuppressWarnings("resource")
		Scanner leitura = new Scanner(System.in);

         for (int j = 0; j < 10; j++) {
             System.out.println("Insira um numero:");
             String numero = leitura.nextLine();
             if (!numero.isEmpty()) {
                 listaNumeros.add(numero);
                 System.out.println(numero);
             }
             }

         }



     }

