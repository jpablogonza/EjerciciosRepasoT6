package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Introducimos las variables
		String frase;
		String palabra;
		int contador = 0;
		
		//Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que nos de una frase
		 System.out.println("Dime una frase:");
		 frase = sc.nextLine();
		 
		 //Le pedimos al usuario que nos de una palabra
		 System.out.println("Dime una palabra:");
		 palabra = sc.nextLine();
		 
		 //Buscamos si aparece la palabra y lo guardamos en la variable "Indice"
		 int indice = frase.indexOf(palabra);
		 
		//Mientras encuentre la palabra en la frase, sumaremos 1 al contador
		 while (indice != -1) {
			 contador++;
			 indice = frase.indexOf(palabra, indice + 1);
		 }
		 
		 //Mostramos cuantas veces aparece la palabra
		 System.out.println("La palabra \"" + palabra + "\" aparece " + contador + " veces en la frase.");
		 
		 //Cerramos el scanner
		 sc.close();
	}

}
