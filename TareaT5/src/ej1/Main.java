package ej1;

import java.util.Scanner;

public class Main {
//para meter valores
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Pon un valor");
		num=sc.nextInt();
		
		
		int busca = Buscaminas.tablas(num);
	}

}
