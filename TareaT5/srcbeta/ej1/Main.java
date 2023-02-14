package ej1;

import java.util.Scanner;

public class Main {
//para meter valores
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Escribe la posición que quieras seleccionar");
		num=sc.nextInt();
		
		
		
		int busca = Buscaminass.tablas(num);
	}

}
