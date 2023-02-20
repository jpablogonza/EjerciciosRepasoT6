package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Introducimos las variables
		String cad1;
		int contador = 0;
		
		//Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que nos de alguna frase
		System.out.println("Dime lo que quieras: ");
		cad1 = sc.nextLine();
		
		for (int i = 0; i < cad1.length(); i++) {
			if (cad1.charAt(i) == ' ') {
				contador++;
			}
		}

		System.out.println("En la frase introducida hay un total de " + contador + " espacios.");
		
		sc.close();
	}

}
