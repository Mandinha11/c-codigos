package java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
import java.util.ArrayList;
public class Aprender {

	public static void main(String[] args) {

	     Scanner leitura = new Scanner(System.in);
	        //String frase = leitura.nextLine();
	     
	        //escrever sysout
	        System.out.println("Escreva algo");

	        try (//ler dados
				        //comando input
			Scanner s = new Scanner(System.in)) {
				//comando em si leitura
				String frase = s.nextLine();

				//exibindo a leitura
				System.out.println(frase);
			}

	        

	        //ctrl + shift + f deixa o programa mais arumado
	        //importe ctrl +1

	        int a;
	        double f;

	        // Importar o uso de leitura
	        String[] vetor = new String[10];
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.println("Insira valor:");
	            vetor[i] = leitura.nextLine();
	        }

	        // inserir ou atualizar
	        vetor[0] = "valor";

	        // remover
	        vetor[0] = null;

	        // manipular ultimop elemento
	        vetor[vetor.length - 1] = "0";

	        // exibir ou percorrer um vetor
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.println(vetor[i]);
	            
	         // Importar o uso de leitura
	            String[] vetor1 = new String[10];
	            for (int i1 = 0; i1 < vetor1.length; i1++) {
	                System.out.println("Insira valor:");
	                vetor1[i1] = leitura.nextLine();
	            }

	            // inserir ou atualizar
	            vetor1[0] = "valor";

	            // remover
	            vetor1[0] = null;

	            // manipular ultimop elemento
	            vetor1[vetor1.length - 1] = "0";

	            // exibir ou percorrer um vetor
	            for (int i1 = 0; i1 < vetor1.length; i1++) {
	                System.out.println(vetor1[i1]);

	                //criando uma lista
	                 ArrayList<String> listaFrutas = new ArrayList<>();

	                 // Inserir elemento
	                 listaFrutas.add("Maça"); //inserir
	                 listaFrutas.set(0, "Banana"); // atualizar
	                 listaFrutas.remove(0);  // remover primeiro elemento
	                 listaFrutas.size(); // retornea o tamanho da lista

	                 // for mais adequado para INSERIR ou ATUALIZAR
	                 for (int j = 0; j < 5; j++) {
	                    System.out.println("Insira uma fruta:");
	                    String fruta = leitura.nextLine();
	                    if (!fruta.isEmpty()) {
	                        listaFrutas.add(fruta);
	                    }

	                }

	                 //Forma mais adequada de EXIBIR elementos lista

	                for (String elemento : listaFrutas) {
	                    System.out.println(elemento);
	                }
	                Scanner leitura1 = new Scanner(System.in);
	                //String frase = leitura.nextLine();

	                // Importar o uso de leitura
	                String[] vetor11 = new String[10];
	                for (int i11 = 0; i11 < vetor11.length; i11++) {
	                    System.out.println("Insira valor:");
	                    vetor11[i11] = leitura1.nextLine();
	                }

	                // inserir ou atualizar
	                vetor11[0] = "valor";

	                // remover
	                vetor11[0] = null;

	                // manipular ultimop elemento
	                vetor11[vetor11.length - 1] = "0";

	                // exibir ou percorrer um vetor
	                for (int i11 = 0; i11 < vetor11.length; i11++) {
	                    System.out.println(vetor11[i11]);

	                    //criando uma lista
	                     ArrayList<String> listaFrutas1 = new ArrayList<>();

	                     // Inserir elemento
	                     listaFrutas1.add("Maça"); //inserir
	                     listaFrutas1.set(0, "Banana"); // atualizar
	                     listaFrutas1.remove(0);  // remover primeiro elemento
	                     listaFrutas1.size(); // retornea o tamanho da lista

	                     // for mais adequado para INSERIR ou ATUALIZAR
	                     for (int j = 0; j < 5; j++) {
	                        System.out.println("Insira uma fruta:");
	                        String fruta = leitura1.nextLine();
	                        if (!fruta.isEmpty()) {
	                            listaFrutas1.add(fruta);
	                        }

	                    }

	                     //Forma mais adequada de EXIBIR elementos lista

	                    for (String elemento : listaFrutas1) {
	                        System.out.println(elemento);
	                    }



	                }
	            }


	            }
	        }
	        }
	    
	
	
