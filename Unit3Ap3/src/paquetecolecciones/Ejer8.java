package paquetecolecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		// crear objeto scanner
		Scanner sc = new Scanner(System.in);

		// construir lista TreeSet -> almacenar numeros enteros positivos
		HashMap<String, String> aclRealBetis = new HashMap<String, String>();

		// variable para almacenar opcion
		int opcion;

		// variable para almacenar nombre usuario
		String username;

		// variable para almacenar passwd
		String passwd;

		// bucle do-while - almacenar palabras en lista ArrayList
		do {

			System.out.println("\nACL REAL BETIS TIENDA OFICIAL");
			// pedir opcion a usuario
			System.out
					.println("Introduzca una opcion:\n" + "1. Registro\n" + "2. Login\n" + "3. Salir");
			opcion = sc.nextInt();

			// limpiar buffer
			sc.nextLine();

			// condicional switch -> evaluar opcion introducida por usuario
			switch (opcion) {
			case 1 -> {
				// bucle do-while -> asegurar que usuario introduzca palabra en español e ingles
				do {
					// pedir username a usuario
					System.out.println("\nIntroduzca nombre de usuario: ");
					username = sc.nextLine().toLowerCase();

					// pedir passwd a usuario
					System.out.println("\nIntroduzca una contraseña: ");
					passwd = sc.nextLine().toLowerCase();
				} while (username.isEmpty() && passwd.isEmpty());

				// añadir username y passwd introducidos por usuario a lista
				aclRealBetis.put(username, passwd);

			}

			case 2 -> {
				do {
					// pedir credenciales usuario
					System.out.println("\nIntroduzca sus credenciales: ");
					System.out.print("Usuario: ");
					username = sc.nextLine().toLowerCase();
					
					System.out.print("\nContraseña: ");
					passwd = sc.nextLine().toLowerCase();

				} while (username.isEmpty() && passwd.isEmpty());

				// condicional if -> controlar que 
				//System.out.println(
						//"\nTRADUCCIÓN: \n" + traductionEspToEng + " -> " + diccionarioES.get(traductionEspToEng));
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
		System.out.println("\nDICCIONARIO\n" );

		// cerrar scanner
		sc.close();
	}
}
