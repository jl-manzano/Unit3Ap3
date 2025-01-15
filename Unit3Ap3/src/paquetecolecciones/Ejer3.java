package paquetecolecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejer3 {
	public static void main(String[] args) {
		// Realiza un programa que genere 30 números enteros aleatorios, con valores
		// comprendidos entre 1 y 10. Se deben almacenar en una colección de forma
		// ordenada. Pinta la colección por consola una vez rellena.

		// crear clase Random
		Random rand = new Random();

		// variable -> almacenar numero aleatorio
		int aleat;

		// variable -> almacenar tamaño ArrayList
		int tamLista = 30;

		// construir lista ArrayList -> almacenar numeros enteros positivos
		ArrayList<Integer> enterosAleatorios = new ArrayList<>();

		// bucle while - almacenar numeros aleatorios en lista ArrayList
		while (tamLista > 0) {

			// generar numero entero aleatorio
			aleat = rand.nextInt(1, 11);

			// añadir numero introducido por usuario a la lista
			enterosAleatorios.add(aleat);

			// decrementar en 1 el tamaño de la lista
			tamLista--;

		}
		
		// ordenar lista
		Collections.sort(enterosAleatorios);
		
		System.out.println("LISTA ORDENADA\n");

		// bucle for -> recorrer lista y mostrar índices de valor par
		for (int i = 0; i < enterosAleatorios.size(); i++) {
			// mostrar resultado
			System.out.println("Índice: " + (i) + " Valor: " + enterosAleatorios.get(i));
		}

	}
}
