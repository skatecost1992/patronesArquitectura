package com.patrones.estructural.decorator;

import java.util.Scanner;

public class PruebasDecorator {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("******************************");
		System.out.println("**BInenvenida comidas rapidas*");
		System.out.println("******************************");
		System.out.println();
		
		Hamburguesa hamburguesa = new  Hamburguesa();
		int opcion = 0;
		
		do {
			
			System.out.println("Con su hamburguesa seleccione la adicion ");
			System.out.println("1 Lechuga, 2.Tomate, 3Queso, 0=Terminar ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				hamburguesa = new Lechuga(hamburguesa);
				break ;
			case 2:
				hamburguesa = new Tomate(hamburguesa);
				break ;
			case 3:
				hamburguesa = new Queso (hamburguesa);
				break ;
			case 0:
				break ;
			default:
				System.out.println("Opcion no valida");
				break ;
			
			}
		}while (opcion!=0);	
			System.out.println();
			System.out.println("Enmtregado .....");
			System.out.println(hamburguesa.getDescripcion());
			System.out.println("Disfrute su pedido");
			
			
			
			
		
			
		
		
	}

}
