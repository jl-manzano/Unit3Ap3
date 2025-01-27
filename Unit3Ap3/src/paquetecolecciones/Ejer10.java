package paquetecolecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// crear mapa HashMap para almacenar los productos y sus precios
		HashMap<String, Double> productos = new HashMap<String, Double>();

		// Creamos un HashMap para almacenar los productos y su stock
		HashMap<String, Integer> stock = new HashMap<String, Integer>();

		// variable para almacenar opcion
		int opcion;

		// variable nombreProducto para almacenar el nombre del producto
		String nombreProducto;

		// variable productoEliminar para almacenar el nombre del producto a eliminar
		String productoEliminar;

		// variable precioProducto para almacenar el precio del producto
		double precioProducto;

		// variable stockProducto para almacenar la cantidad de cada producto
		int stockProducto;

		do {
			// menú
			System.out.println("PRODUCTOS");
			System.out.println("1. Alta de producto");
			System.out.println("2. Baja de producto");
			System.out.println("4. Listar existencias");
			System.out.println("0. Salir");

			// pedir opcion a usuario
			System.out.print("Introduzca una opción: ");
			opcion = sc.nextInt();

			// limpiar el buffer
			sc.nextLine();

			// condicional switch -> evaluar opcion introducida por usuario
			switch (opcion) {
			case 1 -> {

				// pedir nombre de prod a usuario
				System.out.print("Introduce el nombre del producto: ");
				nombreProducto = sc.nextLine();

				// condicional if -> comprobar si producto existe
				if (productos.containsKey(nombreProducto)) {
					System.out.println("El producto ya está registrado");

				} else {

					// pedir a usuario que introduzca precio
					System.out.print("Introduce el precio del producto: ");
					precioProducto = sc.nextDouble();

					// limpiar buffer
					sc.nextLine();

					// registrar producto en el mapa
					productos.put(nombreProducto, precioProducto);
					System.out.println("Producto añadido con éxito.");
				}
			}

			case 2 -> {

				// pedir usuario producto a eliminar
				System.out.print("Introduce el nombre del producto a eliminar: ");
				productoEliminar = sc.nextLine();

				// condicional if -> comprobar que producto existe
				if (productos.containsKey(productoEliminar)) {

					// eliminar producto
					productos.remove(productoEliminar);
					System.out.println("Producto eliminado con éxito.");

				} else {
					System.out.println("El producto en cuestión no existe.");
				}
			}

			case 4 -> {

				// pedir a usuario nombre del prod
				System.out.println("Introduzca el nombre del producto: ");
				nombreProducto = sc.nextLine();

				// condicional if -> comprobar producto no existe
				if (!productos.containsKey(nombreProducto)) {
					System.out.println("El producto no existe.");

				} else {

					// pedir a usuario que introduzca stock del producto
					System.out.println("Introduzca el stock del producto: ");
					stockProducto = sc.nextInt();

					// añadir prod y stock al mapa
					stock.put(nombreProducto, stockProducto);
				}
			}

			case 0 -> {
				System.out.println("Saliendo del programa...");
			}

			default -> {
				System.out.println("Opción no válida. Inténtelo de nuevo.");
			}
			}

		} while (opcion != 0);

		// cerrar scanner
		sc.close();
	}
}