package paquetecolecciones;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejer6 {
	public static void main(String[] args) {
		/*
		 * Repite la actividad anterior de forma que se inserten los nombres manteniendo
		 * el orden alfabético.
		 */

		// crear objeto scanner
		Scanner sc = new Scanner(System.in);

		// construir lista TreeSet -> almacenar numeros enteros positivos
		TreeSet<String> listaNombres = new TreeSet<>();

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
