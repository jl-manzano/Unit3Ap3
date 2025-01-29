package paquetecolecciones2;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// crear mapa HashMap para almacenar las series y sus valoraciones
		LinkedHashMap<String, Double> series = new LinkedHashMap<String, Double>();

		// variable para almacenar opcion
		int opcion;

		// variable nombreSerie para almacenar el nombre de la serie
		String nombreSerie;

		// variable valoracionSerie para almacenar la valoración de la serie
		double valoracionSerie;

		do {
			// menú
			System.out.println("SERIES");
			System.out.println("1. Agregar serie");
			System.out.println("2. Buscar serie");
			System.out.println("3. Eliminar serie");
			System.out.println("4. Salir");

			// pedir opcion a usuario
			System.out.print("\nIntroduzca una opción: ");
			opcion = sc.nextInt();

			// limpiar el buffer
			sc.nextLine();

			// condicional switch -> evaluar opcion introducida por usuario
			switch (opcion) {
			case 1 -> {

				// pedir nombre de serie a usuario
				System.out.print("\nIntroduce el nombre de la serie: \n");
				nombreSerie = sc.nextLine().trim().toUpperCase();

				// condicional if -> comprobar si serie existe
				if (series.containsKey(nombreSerie)) {
					System.out.println("La serie en cuestión ya está registrado");

				} else {

					// pedir a usuario valoración de la serie
					System.out.print("\nIntroduce la valoración de la serie: \n");
					valoracionSerie = sc.nextDouble();

					// limpiar buffer
					sc.nextLine();

					// registrar serie en el mapa
					series.put(nombreSerie, valoracionSerie);
					System.out.println("\nProducto añadido con éxito.\n");
				}
			}

			case 2 -> {

				// pedir usuario serie a buscar
				System.out.print("\nIntroduce el nombre de la serie a buscar: \n");
				nombreSerie = sc.nextLine().trim().toUpperCase();

				// condicional if -> comprobar que serie existe
				if (series.containsKey(nombreSerie)) {

					// mostrar clave y valor serie
					series.get(nombreSerie);

				} else {
					System.out.println("\nLa serie en cuestión no existe.\n");
				}
			}

			case 3 -> {

				// pedir usuario serie a eliminar
				System.out.print("\nIntroduce el nombre de la serie a eliminar: \n");
				nombreSerie = sc.nextLine().trim().toUpperCase();

				// condicional if -> comprobar que serie existe
				if (series.containsKey(nombreSerie)) {

					// eliminar serie
					series.remove(nombreSerie);
					System.out.println("\nSerie eliminada con éxito.\n");

				} else {
					System.out.println("\nLa serie en cuestión no existe.\n");
				}
			}

			case 4 -> {
				System.out.println("\nSaliendo del programa...");
			}

			default -> {
				System.out.println("\nOpción no válida. Inténtelo de nuevo.\n");
			}
			}

		} while (opcion != 4);

		// cerrar scanner
		sc.close();
	}
}