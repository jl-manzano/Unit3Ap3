package paquetecolecciones2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejer1 {
	public static void main(String[] args) {
        // crear lista ArrayList con nºs del 1 al 10
        ArrayList<Integer> listaOriginal = new ArrayList<>();
       
        // bucle for -> almacenar 1-10 en la lista creada
        for (int i = 1; i <= 10; i++) {
            listaOriginal.add(i);
        }
        
        // crear una copia de la lista original
        ArrayList<Integer> listaMezclada = new ArrayList<>(listaOriginal);
        
        // mezclar lista aleatoriamente
        Collections.shuffle(listaMezclada);
        
        
        // mostrar lista
        System.out.println("Lista original: \n" + listaOriginal);
        
        // mostrar lista mezclada
        System.out.println("Lista mezclada: " + listaMezclada);

	}
}
