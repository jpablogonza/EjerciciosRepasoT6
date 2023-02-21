package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Introducimos als variables
		String palabra;
		String frase = "";
		
		//Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			System.out.println("Introduce una palabra y para acabar escribe \"fin\":");
			palabra = sc.next();
			
			if (!palabra.equalsIgnoreCase("fin")) {
				frase += palabra + " ";
			}
		} while (!palabra.equalsIgnoreCase("fin")); {
			
		}
	
		
		System.out.println("La frase sería: " + frase);
		

	}

}
