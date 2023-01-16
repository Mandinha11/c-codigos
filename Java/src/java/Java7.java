package java;

import java.util.ArrayList;
import java.util.Scanner;

public class Java7 {

	public static void main(String[] args) {

	     ArrayList<String> listaNomes = new ArrayList<>();
	        Scanner leitura = new Scanner(System.in);

	        for (int j = 0; j < 10; j++) {
	            System.out.println("Insira um nome:");
	            String nome = leitura.nextLine();
	            if (!nome.isEmpty()) {
	                listaNomes.add(nome);
	            }

	        }

	        listaNomes.set(4, "Erick");
	    }
	
	

}
