package java;

import java.util.Scanner;

public class Java4 {

	public static void main(String[] args) {
		//Ler um número (digitado pelo usuário) e exibir no console se é positivo ou negativo.

		  Scanner  leitura = new Scanner(System.in);
	        

	        System.out.println("Digite um numero:");
	        Integer num = Integer.valueOf(leitura.nextLine());
	        
	        if( num>0) {
	        
	        System.out.println(" O numero digitado é positivo "+num );
	        
	        }
	        else {
	            System.out.println("O numero digitado é negativo "+num);
	        }
	           }


	

}
