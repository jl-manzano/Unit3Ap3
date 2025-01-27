package paquetecolecciones2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejer2 {
	public static void main(String[] args) {
		// crear clase random
		Random rand = new Random();
		
		// construir conjunto LinkedHashSet -> almacenar nºs aleatorios
		LinkedHashSet<Integer> numAleatorios = new LinkedHashSet<Integer>();
		
		// variabler para almacenar nº aleatorio
		int aleat;
		
		// bucle while -> almacenar 10 nºs aleatorios
		while (numAleatorios.size() < 10) {
			// generar numAleatorio
			aleat = rand.nextInt(0,20) + 1;
			
			// añadir nº aleatorio a conjunto
			numAleatorios.add(aleat);
		}
		
		// mostrar nºs generados por pantalla
		System.out.println(numAleatorios);
	}
}
