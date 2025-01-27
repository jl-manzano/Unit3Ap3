package paquetecolecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		// crear objeto scanner
		Scanner sc = new Scanner(System.in);

		// construir mapa HasshMap -> almacenar credenciales de usuarios
		HashMap<String, String> aclRealBetis = new HashMap<String, String>();

		// variable para almacenar opcion
		int opcion;

		// variable para almacenar nombre usuario
		String username;

		// variable para almacenar passwd
		String passwd;

		// variable para almacenar contador
		int contador = 3;
		
		// boolean -> almacenar acceso concedido
		boolean accesoConcedido =  false;

		// bucle do-while - almacenar palabras en lista ArrayList
		do {

			System.out.println("\nACL REAL BETIS TIENDA OFICIAL");
			// pedir opcion a usuario
			System.out.println("Introduzca una opcion:\n" + "1. Registro\n" + "2. Login\n" + "3. Salir");
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
					username = sc.nextLine().trim().toLowerCase();

					// pedir passwd a usuario
					System.out.println("\nIntroduzca una contraseña: ");
					passwd = sc.nextLine().trim().toLowerCase();
				} while (username.isEmpty() && passwd.isEmpty());

				// añadir username y passwd introducidos por usuario a lista
				aclRealBetis.put(username, passwd);

			}

			case 2 -> {

				// bucle while -> controlar si usuario ha intentado acceder más de 3 veces
				while (contador > 0 && !accesoConcedido) {
					// pedir credenciales usuario
					System.out.println("\nIntroduzca sus credenciales: ");
					System.out.print("Usuario: ");
					username = sc.nextLine().trim().toLowerCase();

					System.out.print("\nContraseña: ");
					passwd = sc.nextLine().trim().toLowerCase();
					
					// condicional if -> comprobar si ha introducido valor valido / no
					if (username.isEmpty() && passwd.isEmpty()) {

						// limpiar buffer
						sc.nextLine();
						
						// condicional if -> comprobar si ha introducido valor valido / no
						// pedir credenciales usuario
						System.out.println("\nIntroduzca sus credenciales: ");
						System.out.print("Usuario: ");
						username = sc.nextLine().trim().toLowerCase();

						System.out.print("\nContraseña: ");
						passwd = sc.nextLine().trim().toLowerCase();

					} else if (aclRealBetis.containsKey(username) && aclRealBetis.get(username).equals(passwd)) {
						System.out.println("\nHa accedido al área restringida");
						accesoConcedido = true;
					} else {
						contador--;
						System.out.println("\nCredenciales incorrectas.\nIntentos restantes: " + contador);
					}
					
				}
				
				// condicional if -> determinar si se han agotado los intentos
				if (contador == 0) {
					System.out.println("\nLo siento, no tiene acceso al área restringida");
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

		// cerrar scanner
		sc.close();
	}
}