package paquetecolecciones2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ejer3 {
	public static void main(String[] args) {
		// variable para almacenar texto
		String texto = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";

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
				// añadir letra a lista (se incrementa el contador en 1 (con método get comprueba
				// si letra ya está en el mapa y el contador no sería el contador por defecto (0
				// -> 2º parámetro getOrDefault), si no el nº de veces)
				ocurrenciasLetra.put(letra, ocurrenciasLetra.getOrDefault(letra, 0) + 1);
			}
		}

		// mostrar letras y nº de ocurrencias por cada una en la frase
		for (Map.Entry<Character, Integer> entry : ocurrenciasLetra.entrySet()) {
			System.out.println("Letra " + entry.getKey() + ": " + entry.getValue() + " veces");
		}

	}
}
