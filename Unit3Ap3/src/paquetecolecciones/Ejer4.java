package paquetecolecciones;

import java.util.Random;
import java.util.TreeSet;

public class Ejer4 {
	public static void main(String[] args) {
		// Implementa una aplicación donde se insertan 20 números enteros aleatorios
		// distintos, menores que 10, en una colección. Hay que asegurarse de que se
		// guardan 20. Deben guardarse ordenados a medida que se vayan generando, y se
		// mostrará la colección resultante por pantalla.

		// crear clase Random
		Random rand = new Random();

		// variable -> almacenar numero aleatorio
		int aleat;

		// variable para alamcenar min
		int min = 0;

		// construir lista TreeSet -> almacenar numeros enteros positivos
		TreeSet<Integer> enterosAleatorios = new TreeSet<>();

		// bucle while - almacenar numeros aleatorios en lista
		while (enterosAleatorios.size() < 20) {

			// generar numero entero aleatorio
			aleat = rand.nextInt(min, 100);

			// añadir numero aleatorios a la lista
			enterosAleatorios.add(aleat);

		}

		// mostrar resultado
		System.out.println(enterosAleatorios);

	}
}
