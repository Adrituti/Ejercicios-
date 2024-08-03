package ejerciciosbucles;

import utilidades.Entrada;

public class Main {

	public static void main(String[] args) {
		//EJERCICIO BUCLES NUM1
		
		
		/*System.out.print("Introduce una palabra: ");
		String palabra = Entrada.introducirCadena();
		int contador = 1;
		do {
			System.out.println(contador +".- "+ palabra);
			contador++;
		} while (contador <= 10);*/
		
		//EJERCICIO BUCLES NUM 2
		
		/*System.out.print("Introduzca su edad: ");
		int edad = Entrada.introducirEntero();
		int contador = 1;
		do { 
			System.out.println(contador);
			contador++;
		} while (contador <= edad);*/
		
		//EJERCICIO BUCLES NUM 3
		int num1 = 0;
		do {
			System.out.println("Introduzca un numero entero positivo: ");
			num1 = Entrada.introducirEntero();
		} while (num1<=0);
		int contador = 0;
		do {
			if (contador % 2 != 0) {
				System.out.println(contador);
			}
			contador++;
		}	while (contador<=num1);
		
		
				

	}

}
