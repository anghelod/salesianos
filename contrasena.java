package TAREAS2;

import java.util.Scanner;

/**
 * Esta clase Java ejecuta un programa encargado de leer por pantalla
 * una contrase�a, y de comprobar un m�ximo de 3 veces si el usuario
 * vuelve a escribirla correctamente
 */
public class contrasena {
	/**
	 * Pre: ...
	 * Post: metodo encargado de ejecutar el programa que
	 * comprueba las contrase�as
	 */
	public static void main(String[] args) {
		System.out.print("Introduceme una contrase�a: ");
		Scanner entrada = new Scanner(System.in);
		String contrasena = entrada.nextLine();
		int i = 0;	// Variable para recorrer el bucle
		while(i < 3) {
			System.out.print("Escribeme otra vez la contrase�a: ");
			String contrasena2 = entrada.nextLine();
			if(contrasena.equals(contrasena2)) {
				System.out.println("�Perfecto! Has puesto bien la contrase�a.");
				break;
			} else {
				System.out.println("�Contrase�a incorrecta!");
				i++;
			}
		}
	}
}