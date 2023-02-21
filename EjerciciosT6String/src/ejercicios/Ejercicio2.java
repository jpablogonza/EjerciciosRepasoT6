package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Introducimos las variables
		String contraseña;
		String cad2;
		
		//Ceramos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al primer usuario la contraseña
		System.out.println("Dime la contraseña: ");
		contraseña = sc.next();
		
		//Le pedimos al segundo usuario que adivine la contraseña
		System.out.println("Intenta adivinar la contraseña: ");
		cad2 = sc.next();
		
		//En caso de que las contraseñas no sean iguales las comparamos para dar una pista y volver a intentarlo
		while (!cad2.equals(contraseña)) {
			if (cad2.compareTo(contraseña) < 0) {
				System.out.println("La contraseña introducida es menor alfabéticamente que la contraseña del usuario 1");
			} else {
				System.out.println("La contraseña introducida es mayor alfabéticamente que la contraseña del usuario 1");
			}
			
			System.out.println("Prueba de nuevo otra contraseña: ");
			cad2 = sc.next();
		}
		
			//En caso de que haya acertado la contraseña mostramos que ha acertado
			System.out.println("Enhorabuena acertaste la contraseña");
			
			//Cerramos el scanner
			sc.close();
	}

}
