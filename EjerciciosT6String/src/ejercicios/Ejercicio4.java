package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Introducimos las variables
		String cad1;
		
		//Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos una frase al usuario
		System.out.println("Dime una frase:");
		cad1 = sc.next();
		
		for (int i = cad1.length() - 1; i >= 0; i--) {
			System.out.println("la frase invertida sería: " + cad1.charAt(i));
		}

	}

}
