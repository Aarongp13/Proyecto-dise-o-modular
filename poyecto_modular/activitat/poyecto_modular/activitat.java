package poyecto_modular;

import java.util.Scanner;

public class activitat {

	public class main {
		public static String[] hierba = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };
		public static String[] origen = { "Mexico", "Andorra", "Marrueco", "Palestina" };
		public static double[] precio = { 1.70, 4.20, 2.47, 1.33 };
		
		static Scanner scanner = new Scanner(System.in);

		// Variables publicas extra que considereis

		public static void main(String[] args) {
			String nombre, lugar;
			double cantidad;

			System.out.println("Buenos dias! Que quieres hacer hoy?");

			System.out.println("Usuario selecciona buscar por nombre");
			nombre = "Juana";
			// Codigo para buscar por nombre
			
			System.out.println("Dime el nombre de la hierba quequieres buscar: ");
			
			
			for (int i = 0; i < hierba.length; i++) {
				if (hierba[i].equals(nombre)) {
					System.out.println("Encontrado " + hierba[i]);
					System.out.println("Origen: " + origen[i]);
					System.out.println("Precio" + precio[i]);
					return;
				} 
				
				{
					
				}
				
				System.out.println("No se encontro ninguna hierba con este nombre ");
				
			
			}			
			
			System.out.println("Usuario selecciona buscar por origen");
			lugar = "Andorra";
			// Codigo para buscar por origen

			for (int i = 0; i < origen.length; i++) {
				if(origen[i].equals(lugar)) {
				System.out.println("Hierba encontrada" + hierba[i]);
				System.out.println("Origen: " + origen[i]);
				System.out.println("Precio" + precio[i]);
			}
		}
			System.out.println("No se encontro ninguna hierba en ese origen");
		
			
			System.out.println("Usuario selecciona ordenar por precio de menor a mayor");
			// Codigo para ordenar de mayor a menor precio
			
			for (int i = 0; i < precio.length - 1; i++) {
				for (int j = 0; j < precio.length; j++) {
					if (precio[i] > precio[j]) {
						
						precio [i] = precio [i] + precio [j];
						precio [j] = precio [i] - precio[j];
						precio [i] = precio [i] - precio [j];
						
						String ordenar = hierba[i];
						
						hierba[i] = hierba[j];
						hierba[j] = ordenar; 
						
						ordenar = origen [i];
						origen[i] = origen[i];
						origen[j] = ordenar;
					}
					
				}
				
			}
			
			System.out.println("Orden de hierbas por precio de menor a mayor");
			for (int i = 0; i < hierba.length; i++) {
				System.out.println(hierba[i] + origen[i] + precio[i]);
				
			}

			System.out.println("Usuario selecciona ordenar por precio de menor a mayor");
			// Codigo para ordenar de mayor a menor precio

			System.out.println("Usuario selecciona varios productos para comprar");
			// Codigo para seleccionar primer producto
			nombre1 = "Hierba de los bosques";
			cantidad = 3;

			// Codigo para seleccionar segundo producto
			nombre1 = "El oro verde";
			cantidad = 1;

			// Codigo para seleccionar tercer producto
			nombre1 = "La seta feliz";
			cantidad = 2.5;
			
			System.out.println("Usuario elimina el segundo elemento de su carrito");
			// Codigo para eliminar elemento del carrito

			System.out.println("Usuario finaliza la compra");
			// Codigo para finalizar la compra y que salga el total de la compra
		}
		
		//Funciones extra que considereis necesarias
	}
}
