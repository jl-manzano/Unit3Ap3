package paquetecolecciones2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class Ejer3 {
	public static void main(String[] args) {
		// variable para almacenar texto
		String texto = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";

		// variable para almacenar contador
		int cont = 1;
		
		// construir lista ArrayList para almacenar letras
		LinkedHashMap<Character, Integer> ocurrenciasLetra = new LinkedHashMap<>();

		// mostrar oracion en pantalla
		System.out.println(texto);

		// pasar texto a minúsculas
		texto = texto.toLowerCase();

		// bucle for -> añadir letras a la lista
		for (char letra : texto.toCharArray()) {

			// condicional if -> comprobar con método isLetter de clase Character que es una
			// letra
			if (Character.isLetter(letra)) {
				// añadir letra a lista
				ocurrenciasLetra.put(letra, ocurrenciasLetra.getOrDefault(letra, 0) + 1);
			}
		}
		
		// por terminar


	}
}
