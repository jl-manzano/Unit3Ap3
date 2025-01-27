package paquetecolecciones;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejer9 {
	public static void main(String[] args) {
		/*
		 * Implementa una aplicación donde ir registrando el número de veces que ha
		 * salido cada número del euromillón. Para ello tendrás que usar dos
		 * colecciones, una para los números y otra para las estrellas. Al usuario se le
		 * debe pedir que introduzca primero los 5 números y a continuación las 2
		 * estrellas del último sorteo. El programa comprobará si ya se encuentra el
		 * número correspondiente en la colección, si no está, lo añadirá y le pondrá el
		 * valor 1. Si ya está, incrementará en 1 su valor. Las colecciones no pueden
		 * tener repetidos y deben estar ordenadas.
		 */

		// crear objeto scanner
		Scanner sc = new Scanner(System.in);

		// construir mapa TreeMap -> almacenar números y contador de las veces que han
		// sido introducidos
		TreeMap<Integer, Integer> mapaNumeros = new TreeMap<Integer, Integer>();

		// construir mapa TreeMap -> almacenar estrellas y contador de las veces que han
		// sido introducidas
		TreeMap<Integer, Integer> mapaEstrellas = new TreeMap<Integer, Integer>();

		// variable para almacenar numero
		int num;

		// variable -> almacenar estrella
		int estrella;

		System.out.println("INTRODUZCA 5 NÚMEROS DEL 1 AL 5O: ");

		// bucle for -> asegurar que usuario introduce 5 números
		for (int i = 0; i < 5; i++) {
			do {
				// pedir num a usuario
				System.out.print("Número " + (i + 1) + ": ");
				num = sc.nextInt();

				// condicional if -> comprobar si num está dentro del rango
				if (num < 1 || num > 50) {
					System.out.println("Número fuera de rango. Debe ser entre 1 y 50.");
				}

			} while (num < 1 || num > 50);

			// añadir num al mapa (se incrementa el contador en 1 (con método get comprueba
			// si num ya está en el mapa y el contador no sería el contador por defecto (0
			// -> 2º parámetro getOrDefault), si no el nº de veces)
			mapaNumeros.put(num, mapaNumeros.getOrDefault(num, 0) + 1);

		}

		System.out.println("\nINTRODUZCA 2 ESTRELLAS DEL SORTEO DEL 1 AL 12: ");

		// bucle for -> asegurar que usuario introduce 2 estrellas
		for (int i = 0; i < 2; i++) {
			do {
				// pedir estrella a usuario
				System.out.print("Estrella " + (i + 1) + ": ");
				estrella = sc.nextInt();

				// condicional if -> comprobar si num está dentro del rango
				if (estrella < 1 || estrella > 12) {
					System.out.println("Estrella fuera de rango. Debe ser entre 1 y 12.");
				}

			} while (estrella < 1 || estrella > 12);
			
			// añadir estrella al mapa (se incrementa el contador en 1 (con método get comprueba
			// si estrella ya está en el mapa y el contador no sería el contador por defecto (0
			// -> 2º parámetro getOrDefault), si no el nº de veces)
			mapaEstrellas.put(estrella, mapaEstrellas.getOrDefault(estrella, 0) + 1);
			
		}
		
		System.out.println();
		
		// mostrar nºs registrados
		for (Map.Entry<Integer, Integer> entry : mapaNumeros.entrySet()) {
			System.out.println("Número " + entry.getKey() + ": " + entry.getValue() + " veces.");
		}
		
		System.out.println();
		
		// mostrar entradas registradas
		for (Map.Entry<Integer,Integer> entry : mapaEstrellas.entrySet()) {
			System.out.println("Estrella " + entry.getKey() + ": " + entry.getValue() + " veces");
		}
		
		// cerrar scanner
		sc.close();

	}
}
