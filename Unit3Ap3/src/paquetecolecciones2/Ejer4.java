package paquetecolecciones2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// crear mapa HashMap para almacenar los productos y sus precios
		LinkedList<String> nombres = new LinkedList<>();

		// variable para almacenar opcion
		int opcion;

		// variable nombrePersona para almacenar el nombre de la persona
		String nombrePersona;

		do {
			// menú
			System.out.println("LISTA DE NOMBRES");
			System.out.println("1. Añadir nuevo nombre a la lista");
			System.out.println("2. Elimina un nombre específico");
			System.out.println("3. Ordena la lista alfabéticamente");
			System.out.println("4. Buscar nombre específico en la lista");
			System.out.println("0. Salir");

			// pedir opcion a usuario
			System.out.print("\nIntroduzca una opción: ");
			opcion = sc.nextInt();

			// limpiar el buffer
			sc.nextLine();

			// condicional switch -> evaluar opcion introducida por usuario
			switch (opcion) {
			case 1 -> {

				// pedir nombre a usuario
				System.out.print("\nIntroduce un nuevo nombre: ");
				nombrePersona = sc.nextLine().trim().toLowerCase();

				// condicional if -> comprobar si nombre existe
				if (nombres.contains(nombrePersona)) {
					System.out.println("\nEl nombre ya está registrado. Inténtelo de nuevo con otro.");

				} else {

					// registrar nombre en lista
					nombres.add(nombrePersona);
					System.out.println("Nombre añadido con éxito.\n");
				}
			}

			case 2 -> {

				// pedir usuario nombre a eliminar
				System.out.print("\nIntroduce el nombre de la persona a eliminar: ");
				nombrePersona = sc.nextLine().trim().toLowerCase();

				// condicional if -> comprobar que producto existe
				if (nombres.contains(nombrePersona)) {

					// eliminar producto
					nombres.remove(nombrePersona);
					System.out.println("\nNombre eliminado con éxito.\n");

				} else {
					System.out.println("\nEl nombre en cuestión no existe.\n");
				}
			}

			case 3 -> {

				// ordenar alfabéticamente lista
				Collections.sort(nombres);

			}

			case 4 -> {
				// pedir usuario nombre a buscar
				System.out.print("\nIntroduce el nombre del la persona a eliminar: ");
				nombrePersona = sc.nextLine().trim().toLowerCase();

				// condicional if -> comprobar si nombre existe
				if (nombres.contains(nombrePersona)) {
					System.out.println("\nEl nombre ya está registrado\n");

				}

				// limpiar buffer
				sc.nextLine();
			}

			case 5 -> {
				System.out.println("\nSaliendo del programa...");
			}

			default -> {
				System.out.println("Opción no válida. Inténtelo de nuevo.\n");
			}
			}

		} while (opcion != 5);

		// cerrar scanner
		sc.close();
	}
}