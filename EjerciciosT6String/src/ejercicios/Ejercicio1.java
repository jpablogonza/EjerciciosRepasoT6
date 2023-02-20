package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Introducimos las variables
		String frase1;
		String frase2;
		
		//Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario dos frases
		System.out.println("Dame dos frases: ");
		frase1 = sc.next();
		frase2 = sc.next();
		
		//Ponemos als condiciones
		if (frase1.length() < frase2.length()) {
			System.out.println("La primera frase es más corta que la segunda");
		} else if (frase1.length() > frase2.length()) {
			System.out.println("La segunda frase es más corta que la primera");
		} else {
			System.out.println("Las dos frases son iguales");
		}
		
		//Cerramos el scanner
		sc.close();
    }
	

}
