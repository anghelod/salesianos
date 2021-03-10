package TAREAS2;

import java.util.Scanner;

/**
 * Esta clase Java ejecuta un programa encargado de leer por pantalla
 * una contraseña, y de comprobar un máximo de 3 veces si el usuario
 * vuelve a escribirla correctamente
 */
public class contrasena {
	/**
	 * Pre: ...
	 * Post: metodo encargado de ejecutar el programa que
	 * comprueba las contraseñas
	 */
	public static void main(String[] args) {
		System.out.print("Introduceme una contraseña: ");
		Scanner entrada = new Scanner(System.in);
		String contrasena = entrada.nextLine();
		int i = 0;	// Variable para recorrer el bucle
		while(i < 3) {
			System.out.print("Escribeme otra vez la contraseña: ");
			String contrasena2 = entrada.nextLine();
			if(contrasena.equals(contrasena2)) {
				System.out.println("¡Perfecto! Has puesto bien la contraseña.");
				break;
			} else {
				System.out.println("¡Contraseña incorrecta!");
				i++;
			}
		}
	}
}