package paquetecolecciones;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejer7 {
	/*
	 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
	 * (con su correspondiente traducción). Utiliza un objeto de la clase TreeMap
	 * para almacenar las parejas de palabras. El programa mostrará un menú con dos
	 * opciones: Inserta palabra. Debe solicitar una palabra en español y su
	 * traducción al inglés. Busca palabra. Pregunta por una palabra en español y
	 * devuelve su traducción en inglés. Salir. Termina el programa.
	 */

	public static void main(String[] args) {
		// crear objeto scanner
		Scanner sc = new Scanner(System.in);

		// construir lista TreeSet -> almacenar numeros enteros positivos
		TreeMap<String, String> diccionarioES = new TreeMap<String, String>();

		// variable para almacenar opcion
		int opcion;

		// variable para almacenar palabra en español
		String palabraEsp;

		// variable para almacenar palabra en inglés
		String palabraEng;

		// variable para almacenar palabra que se quiere traducir
		String traductionEspToEng;

		// bucle do-while - almacenar palabras en lista ArrayList
		do {

			System.out.println("\nDICCIONARIO ESP-ENG");
			// pedir opcion a usuario
			System.out
					.println("Introduzca una opcion:\n" + "1. Insertar palabra\n" + "2. Busca palabra\n" + "3. Salir");
			opcion = sc.nextInt();

			// limpiar buffer
			sc.nextLine();

			// condicional switch -> evaluar opcion introducida por usuario
			switch (opcion) {
			case 1 -> {

				// pedir palabra en español a usuario
				System.out.println("\nIntroduzca palabra (ESP): ");
				palabraEsp = sc.nextLine().toLowerCase();

				// pedir palabra en ingles a usuario
				System.out.println("\nIntroduzca palabra (ENG): ");
				palabraEng = sc.nextLine().toLowerCase();

				// añadir palabras (esp, eng) introducidas por usuario a lista
				diccionarioES.put(palabraEsp, palabraEng);

			}

			case 2 -> {
				// pedir palabra en español a usuario
				System.out.println("\nIntroduzca palabra a traducir (ESP -> ENG): ");
				traductionEspToEng = sc.nextLine().toLowerCase();

				// condicional if -> controlar que la palabra se encuentra en el diccionario /
				// si no - devolver que no se encuentra
				if (diccionarioES.get(traductionEspToEng) != null) {
					// usar método get (introducir clave (palabra (ESP) y devuelve valor (palabra
					// ENG))
					System.out.println(
							"\nTRADUCCIÓN: \n" + traductionEspToEng + " -> " + diccionarioES.get(traductionEspToEng));
				} else {
					System.err.println("La palabra no se encuentra en el diccionario.");
				}

			}

			case 3 -> {
				System.out.println("\n Saliendo del programa ...");
			}

			default -> {
				System.out.println("\nSin coincidencias.");
			}

			}
		} while (opcion != 3);

		// mostrar resultado
		System.out.println("\nDICCIONARIO\n" + diccionarioES);

		// cerrar scanner
		sc.close();
	}

}
