package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Introducimos las variables
		String cad1;
		
		//Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos una frase al usuario
		System.out.println("Dime una frase:");
		cad1 = sc.nextLine();
		
		for (int i = cad1.length() - 1; i >= 0; i--) {
			System.out.print(cad1.charAt(i));
		}
		
		//Cerramos el scanner
		sc.close();

	}

}
