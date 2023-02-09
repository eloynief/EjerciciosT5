package ej1;

public class Buscaminas {

	
	public static int[] main(int[] valor) {
		// TODO Auto-generated method stub
		int[] juego= new int[20];
		int[] campovisible= new int[20];
		int numero=0;
		
		//posicionar las minas en el numero aleatorio hasta los 6
		for (int i=0;i<=6;i++) {
			
			
			//crear las posiciones aleatorias
			numero=(int) (Math.random()*20);
			
			//el -1 son las minas que se generarán de manera automática
			juego[numero]=-1;
			//si por alguna casualidad
			if(juego[numero]==-1){
				/*
				if(numero>0||numero<20) {
					juego[numero+1]=-1;
				}
				*/
			}
		}
		
		//leer los valores de la tabla de nuevo
		for(int lectura=0;lectura<juego.length;lectura++) {
			//si en esa posición hay una mina
			if(juego[numero]==-1&&juego[lectura]<juego.length-1) {
				//en la posición siguiente se aumenta en 1
				juego[lectura+1]+=1;
				
			}
			//y si en esa posición hay una mina
			if(juego[numero]==-1 && juego[lectura]>0) {
				//en la posición anterior se aumenta en 1
				juego[lectura-1]+=1;
				
			}
		}
		
		
		
		for (int i=0;i<valor.length;i++) {
			//crear 
			numero=(int) (Math.random()*20);
			juego[i]=numero;
			
			//creamos un campo el cual esté lleno de minas para luego pasar los valores a esta tabla segun lo que escribas
			
			//si ese valor que te sale al escribir un numero de la posición en la tabla es -1, entonces el juego acaba
			campovisible[i]=-1;
			//
			if(juego[/*numero a introducir*/]=campovisible[/*numero a introducir*/]){
				System.out.println("Perdistes");
			}
			else {
				juego[/*numero a introducir*/]=campovisible[/*numero a introducir*/];
				
			}
		}
		//crear for para crear numeros 
		
		
		//el return hara que puedas poner un valor en el buscaminas main
		
	}

}










/*TEMA 5 - EJERCICIOS PRÁCTICOS
Realizaremos el juego del buscaminas con un array unidimensional. Para aquellos que no hayan jugado nunca (ni siquiera mientras estoy explicando algo), os recuerdo que el juego consiste en destapar todas las casillas de una tabla menos las minas. Si pisamos una mina el juego acaba y hemos perdido.
El juego nos proporcionará pistas, de forma que si destapamos una casilla y no hay una mina, esta casilla nos indicará cuantas minas hay adyacentes a esa posición. Por lo tanto el ordenador debe preparar una tabla de 20 casillas para nosotros en el que colocará 6 minas y las pistas correspondientes.
Ejemplo: {0,1,*,1,1,*,*,2,*,1,0,0,0}
Este panel permanecerá oculto y es el jugador el que debe tratar de descubrirlo. En cada turno, el jugador indicará qué casilla quiere destapar. Si en esa casilla no hay ninguna mina, se le debe indicar al jugador la pista que hay en esa casilla. Si hay una mina, se le mostrará un mensaje al jugador indicando que ha perdido.
No hagas todo el ejercicio en un main, debes definir distintas funciones para llevarlo a cabo, por ejemplo, una función que inicialice el array con las minas y las pistas, otra función que indique si el juego se ha acabado, etc. Recuerda que las funciones deben definirse en una clase independiente a la clase main. El juego debe seguir ejecutándose hasta que el jugador destape una mina, o haya destapado todas las pistas.
Las Siete y Media es un juego de naipes consistente en ir pidiendo cartas hasta alcanzar 7 puntos y medio, sin pasarse. Recuerda que la baraja española consta de cuatro palos (oros, copas, espadas y bastos), cada uno de los cuales contiene diez cartas (1, 2, 3, 4, 5, 6, 7, sota, caballo y rey).
En el juego de las Siete y Media, cada carta conserva su valor numérico, excepto las figuras (sota, caballo y rey), que valen medio punto cada una. Así, por ejemplo, si nos sale un cinco y luego una sota, tenemos cinco puntos y medio.
El juego lo gana quien se acerca más a siete y medio sin pasarse.
Escribe una versión simplificada de las siete y media para dos jugadores. Su funcionamiento debe ser el siguiente:
A) El juego empieza por el jugador 1. El ordenador le pregunta si desea pedir una carta:
Si la respuesta es "sí", el ordenador elige una carta al azar (las cartas pueden repetirse en elecciones sucesivas) y muestra la puntuación total acumulada hasta ahora por el jugador.
Si la respuesta es "no", el turno pasa al jugador 2.
El paso A se repite hasta que el jugador responda “no” o hasta que, tras sacar una carta, se pase de 7 puntos y medio. En tal caso, pierde su turno y empieza el del jugador 2 .
B) El juego continúa por el jugador 2. El ordenador le pregunta si desea pedir una carta:
Si la respuesta es "sí", el ordenador elige una carta al azar y muestra la puntuación total acumulada hasta ahora por el jugador. 
Si la respuesta es "no", el juego termina.
El paso B se repite hasta que el jugador responda “no” o hasta que, tras sacar una carta, se pase de 7 puntos y medio. En tal caso, pierde su turno y el juego termina.
C) Por último, se compara la puntuación obtenida por cada jugador y se proclama el vencedor. Gana el que más se acerque a 7 puntos y medio sin pasarse. También es posible que ocurra un empate.

Realiza el ejercicio utilizando funciones. Fíjate que los turnos de los dos jugadores son iguales. Añade todas las funciones que veas necesarias para simplificar el main en lo posible. Recuerda que las funciones se deben implementar en un fichero independiente al del main.

*/