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

		
			
			System.out.println("Usuario selecciona varios productos para comprar");
			// Codigo para seleccionar primer producto
			nombre = "Hierba de los bosques";
			cantidad = 3;

			
			int precioDelProducto = 0;
			for (int i = 0; i < hierba.length; i++) {
				if(hierba[i].equals(nombre)); { 
					precioDelProducto = (int) precio[i];
					break;
				}
				
			}
			
			int total = (int) (precioDelProducto * cantidad); 
			
			System.out.println("Cantidad" + cantidad + "unidades" + nombre + "precio" + total/100);
			
			// Codigo para seleccionar segundo producto
			nombre = "El oro verde";
			cantidad = 1;
			
			int precioDelProducto2 = 0;
			for (int i = 0; i < hierba.length; i++) {
				if(hierba[i].equals(nombre)); { 
					precioDelProducto2 = (int) precio[i];
					break;
				}
				
			}
			
			int total2 = (int) (precioDelProducto2 * cantidad); 
			
			System.out.println("Cantidad" + cantidad + "unidades" + nombre + "precio" + total2/100);

			// Codigo para seleccionar tercer producto
			nombre = "La seta feliz";
			cantidad = 2.5;
			
			int precioDelProducto3 = 0;
			for (int i = 0; i < hierba.length; i++) {
				if(hierba[i].equals(nombre)); { 
					precioDelProducto3 = (int) precio[i];
					break;
				}
				
			}
			
			int total3 = (int) (precioDelProducto3 * cantidad); 
			
			System.out.println("Cantidad" + cantidad + "unidades" + nombre + "precio" + total3/100);
			
			System.out.println("Usuario elimina el segundo elemento de su carrito");
			// Codigo para eliminar elemento del carrito

			for (int i = 0; i < hierba.length; i++) {
				hierba[i] = hierba[i + 1];
				origen[i] = origen[i + 1];
				precio[i] = precio[i + 1];
				
			}
			
				System.out.println("carrito despues de eliminar el producto");
				for (int i = 0; i < hierba.length; i++) {
					if(hierba[i] != null) {
						System.out.println(hierba[i] + origen + (precio[i] /100));
					}
					
				}
			
			System.out.println("Usuario finaliza la compra");
			// Codigo para finalizar la compra y que salga el total de la compra
			
			int totalCompra = 0;
			
			for (int i = 0; i < hierba.length; i++) {
				if (hierba[i] != null) {
					totalCompra += precio[i];
				}
				
			}
			
			System.out.println("el total de la compra es de " + (totalCompra /100));
			
			scanner.close();
		}
		
		//Funciones extra que considereis necesarias
	}
}
