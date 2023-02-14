package ej2;

//en el main de este ejercicio todavía no has puesto nada

import java.util.Arrays;
import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)crear cartas
		//el 10 representa el numero de cartas y el 4 los tipos de cartas
		//numx debe ser menor de 11 y numy menor que 5
		int numx=0,numy=0,turno=0;
		//el valor representa la suma de los valores de las cartas del jugador
		double valor1=0,valor2=0,carta=0;
		int[][] cartas = new int [4][10];
		String tipo = null,numero = null;
		int seleccion=0;
		Scanner sc= new Scanner(System.in);
		//llenar el array de 0
		System.out.println(Arrays.deepToString(cartas));
		
		
		
		//las cartas que recibes
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<10;j++) {
				
				if(turno==0) {
					System.out.println("Es el turno del Jugador 1");
					System.out.println("quieres sacar una carta (s/n)? ");
					//de momento es un int
					seleccion=sc.nextInt();
					
					//si dices que si
					if(seleccion==1) {
						
						//generar valor random si seleccionas si
						numx = (int) (Math.random() * 4+1);
						numy = (int) (Math.random() * 10+1);
						
						//si ya recibistes la carta, entonces sale error y debes seleccionar de nuevo
						while(cartas[numx-1][numy-1]==1) {
							//has recibido la carta, pero como ya la tenías
							numx = (int) (Math.random() * 4+1);
							numy = (int) (Math.random() * 10+1);
						}
						
						//se iguala un double
						carta=numy;
						if(carta>7) {
							carta=0.5;
						}
						//se guarda el valor
						valor1=carta+valor1;
						
						//en este switch case muestra los tipos de cartas
						switch(numx) {
							case 1:{
								tipo="OROS";
								break;
							}
							case 2:{
								tipo="COPAS";
								break;
							}
							case 3:{
								tipo="ESPADAS";
								break;
							}
							case 4:{
								tipo="BASTOS";
								break;
							}
						}
						
						switch(numy) {
							case 1:{
								numero="UNO";
								break;
							}
							case 2:{
								numero="DOS";
								break;
							}
							case 3:{
								numero="TRES";
								break;
							}
							case 4:{
								numero="CUATRO";
								break;
							}
							case 5:{
								numero="CINCO";
								break;
							}
							case 6:{
								numero="SEIS";
								break;
							}
							case 7:{
								numero="SIETE";
								break;
							}
							case 8:{
								numero="SOTA";
								break;
							}
							case 9:{
								numero="CABALLO";
								break;
							}
							case 10:{
								numero="REY";
								break;
							}
						}
						
						if(valor1<7.5) {
							System.out.println("has recibido el "+numero+" de "+tipo);
							cartas[numx-1][numy-1]=1;
						System.out.println(Arrays.deepToString(cartas));
						System.out.println("Tienes: "+valor1+" puntos");
						}
						else {
							System.out.println("Te has pasado");
							//cuando el turno=-1, entonces se acaba la partida
							turno=1;
						}
					}
					//si la selección es n, entonces pasa al otro jugador
					else {
						//si turno es 1, aumenta el turno, y si turno es 1, entonces es el turno del otro jugador
						turno++;
					}
				}
				
				
				
				
				
				
				//turno del j2
				if(turno==1) {
					System.out.println("Es el turno del Jugador 2");
					System.out.println("quieres sacar una carta (s/n)? ");
					//de momento es un int
					seleccion=sc.nextInt();
					
					//si dices que si
					if(seleccion==1) {
						
						//generar valor random si seleccionas si
						numx = (int) (Math.random() * 4+1);
						numy = (int) (Math.random() * 10+1);
						
						//si ya recibistes la carta, entonces sale error y debes seleccionar de nuevo
						while(cartas[numx-1][numy-1]==1) {
							//has recibido la carta, pero como ya la tenías
							numx = (int) (Math.random() * 4+1);
							numy = (int) (Math.random() * 10+1);
						}
						carta=numy;
						if(carta>7) {
							carta=0.5;
						}
						//se guarda el valor
						valor2=carta+valor2;
						
						//en este switch case muestra los tipos de cartas
						switch(numx) {
							case 1:{
								tipo="OROS";
								break;
							}
							case 2:{
								tipo="COPAS";
								break;
							}
							case 3:{
								tipo="ESPADAS";
								break;
							}
							case 4:{
								tipo="BASTOS";
								break;
							}
						}
						
						switch(numy) {
							case 1:{
								numero="UNO";
								break;
							}
							case 2:{
								numero="DOS";
								break;
							}
							case 3:{
								numero="TRES";
								break;
							}
							case 4:{
								numero="CUATRO";
								break;
							}
							case 5:{
								numero="CINCO";
								break;
							}
							case 6:{
								numero="SEIS";
								break;
							}
							case 7:{
								numero="SIETE";
								break;
							}
							case 8:{
								numero="SOTA";
								break;
							}
							case 9:{
								numero="CABALLO";
								break;
							}
							case 10:{
								numero="REY";
								break;
							}
						}
						
						if(valor2<7.5) {
							System.out.println("has recibido el "+numero+" de "+tipo);
							cartas[numx-1][numy-1]=1;
						System.out.println(Arrays.deepToString(cartas));
						System.out.println("Tienes: "+valor2+" puntos");
						}
						else {
							System.out.println("has recibido el "+numero+" de "+tipo);
							System.out.println("Te has pasado");
							//cuando el turno=-1, entonces se acaba la partida
							turno=-1;
						}
					}
					//si la selección es n, entonces pasa al otro jugador
					else {
						//si turno es 1, aumenta el turno, y si turno es 1, entonces es el turno del otro jugador
						turno=-1;
					}
				}
				
			}
			//guardar la puntuación
			
			
			
		}
		
		//si la puntuación
		if(valor1>valor2&&valor1<=7.5) {
			System.out.println("Gana el J1");
		}
		else if(valor1<valor2&&valor2<=7.5) {
			System.out.println("Gana el J2");
		}
		else {
			System.out.println("Empate");
		}
		
	}
	
	public static void String(String tipo,String numero) {
		
	}

}
