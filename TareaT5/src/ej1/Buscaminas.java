package ej1;

import java.util.Arrays;

public class Buscaminas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] juego = new int[20];
		int[] campovisible = new int[20];

		int numero = 0;
		int jugadas = 0;
		int introducir = 0;
		int i=1;
		// paso 1: hacemos una tabla llena de minas
		Arrays.fill(campovisible, -1);
		
		
		//paso2:
		while (i <= 6) {

			// crear las posiciones aleatorias
			numero = (int) (Math.random() * 20);

			// si esa parte no es
			if (juego[numero] != -1) {
				juego[numero] = -1;
				i++;
				
			}

		}
		
		// leer los valores de la tabla de nuevo
		for (int lectura = 0; lectura < juego.length; lectura++) {
			// si en esa posición hay una mina
			if (juego[lectura] == -1 && lectura < juego.length - 1&&juego[lectura+1]!=-1) {
				
				// en la posición siguiente se aumenta en 1
				juego[lectura + 1] += 1;

			}
			// y si en esa posición hay una mina
			if (juego[lectura] == -1 && lectura > 0&&juego[lectura-1]!=-1) {
				// en la posición anterior se aumenta en 1
				juego[lectura - 1] += 1;

			}
		}
	}

}
