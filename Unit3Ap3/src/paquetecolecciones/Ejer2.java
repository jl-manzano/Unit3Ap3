package paquetecolecciones;

import java.util.ArrayList;
import java.util.Random;

public class Ejer2 {
	public static void main(String[] args) {

		// Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
		// ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
		// esos números. El tamaño de la lista también será aleatorio y podrá oscilar
		// entre 5 y 10 elementos ambos inclusive.

		// crear clase Random
		Random rand = new Random();

		// variable -> almacenar numero aleatorio
		int aleat;

		// variable -> almacenar tamaño ArrayList
		int tamLista = rand.nextInt(5, 11);

		// variable -> almacenar suma
		int suma = 0;

		// variable -> almacenar media
		double media = 0;

		// variable -> almacenar minimo
		int min = Integer.MAX_VALUE;

		// variable -> almacenar maximo
		int max = Integer.MIN_VALUE;

		// construir lista ArrayList -> almacenar numeros enteros positivos
		ArrayList<Integer> enterosAleatorios = new ArrayList<>();

		// bucle while - almacenar numeros aleatorios en lista ArrayList
		while (tamLista > 0) {

			// generar numero entero aleatorio
			aleat = rand.nextInt(100);

			// añadir numero introducido por usuario a la lista
			enterosAleatorios.add(aleat);

			// decrementar en 1 el tamaño de la lista
			tamLista--;

		}

		// bucle for -> recorrer lista y mostrar índices de valor par
		for (int i = 0; i < enterosAleatorios.size(); i++) {
			// mostrar resultado
			System.out.println("Índice: " + (i) + " Valor: " + enterosAleatorios.get(i));

			// sumar valores de lista a variable suma
			suma += enterosAleatorios.get(i);

			// determinar valor minimo de los valores de la lista
			if (enterosAleatorios.get(i) < min) {
				min = enterosAleatorios.get(i);
			}

			// determinar valor maximo de los valores de la lista
			if (enterosAleatorios.get(i) > max) {
				max = enterosAleatorios.get(i);
			}

		}

		// calcular media de los valores de la lista
		media = (double) suma / enterosAleatorios.size();
		
		// mostrar resultado
		System.out.println("\nSuma: " + suma);
		System.out.println("Media aritmética: " + String.format("%.2f", media));
		System.out.println("Mínimo: " + min);
		System.out.println("Máximo: " + max);

	}
}
