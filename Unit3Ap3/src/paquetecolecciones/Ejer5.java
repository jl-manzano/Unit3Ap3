package paquetecolecciones;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		/* Introduce por teclado, hasta que se introduzca “fin”, una serie de nombres,
		 que se insertarán en una colección, de forma que se conserve el orden de
		 inserción y que no puedan repetirse. Al final, la colección se mostrará por
		 pantalla.*/
		
		// crear objeto scanner
		Scanner sc = new Scanner(System.in);
		
		// construir conjunto LinkedHashSet -> almacenar numeros enteros positivos
		LinkedHashSet<String> listaNombres = new LinkedHashSet<>();
		
		// variable para almacenar nombre introducida por usuario
		String nombre;
		
		// pedir nombre a usuario
		System.out.println("Introduzca un nombre: ");
		nombre = sc.nextLine();

		// bucle while - almacenar nombres en lista
		while (!nombre.equalsIgnoreCase("fin")) {

			// añadir nombre introducido por usuario a lista
			listaNombres.add(nombre);			
			
			// pedir nombre a usuario
			System.out.println("\nIntroduzca un nombre: ");
			nombre = sc.nextLine();

		}
		
		System.out.println(listaNombres.size());
		
		// condicional if -> mostrar listaNombres
		if (listaNombres.size() > 0) {
			// mostrar resultado
			System.out.println(listaNombres);
		} else {
			System.out.println("\nHas introducido la palabra \"fin\" como 1ª palabra.");
		}
		
		// cerrar scanner
		sc.close();

	}
}
