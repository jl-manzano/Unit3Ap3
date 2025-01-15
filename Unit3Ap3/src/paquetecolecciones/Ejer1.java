package paquetecolecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		// Crear una lista de números enteros positivos introducidos por consola hasta
		// que se introduzca uno negativo. A continuación, recorrer la lista y mostrar
		// por pantalla los índices de los elementos de valor par.

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// variable -> almacenar numero introducido por consola
		int num = 0;
		
		// variable -> almacenar indice
		int indice = 0;


		// construir lista ArrayList -> almacenar numeros enteros positivos
		ArrayList<Integer> enterosPositivos = new ArrayList<>();

		// pedir a
		System.out.println("Introduzca un número entero positivo nuevo: ");

		// leer frase introducida por teclado
		num = sc.nextInt();

		// bucle while - pedir a usuario numeros enteros y almacenar en lista ArrayList
		// hasta introducir negativo
		while (num >= 0) {

			// añadir numero introducido por usuario a la lista
			enterosPositivos.add(num);

			// volver a pedir num a usuario
			System.out.println("Introduzca un número entero positivo nuevo: ");

			// leer frase introducida por teclado
			num = sc.nextInt();

		}
		
		System.out.println("\nVERSION 1 - FOR");

		
		// bucle for -> recorrer lista y mostrar índices de valor par
		for (int i = 0; i < enterosPositivos.size(); i++) {
			if (enterosPositivos.get(i) % 2 == 0) {
				System.out.println("Índice: " + (i) + " Valor: " + enterosPositivos.get(i));
			}
		}
		
		System.out.println("\nVERSION 2 - FOR-EACH");

		// bucle for-each -> recorrer lista y mostrar índices de valor par
		for (int valor : enterosPositivos) {
			// condicional if -> verificar num - es par
			if (valor % 2 == 0) {
				System.out.println("Índice: " + (indice) + " Valor: " + valor);
			}
			
			indice++;
			
		}
		
		// cerrar scanner
		sc.close();

	}
}
