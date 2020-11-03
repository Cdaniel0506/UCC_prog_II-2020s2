package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio15 {
	static Scanner entrada = new Scanner(System.in);
	public static void main (String[] args) {
System.out.println(":::::::Problema de Embarcaciones:::::::");
		
		float hmill,milla,pdias,r,tr,hr;
		System.out.println(":::::::--: Tres embarcaciones::::::");
		System.out.println("");
		System.out.println(":::::Embarcacion #1:::::");
		System.out.println("Nota: la distancia que tendran que pasar las 3 embarcaciones es de unas 1200 millas.");
		System.out.println("");
		System.out.println("Digite el numero de milla-s de -->(ida) que recorre la embarcacion por hora-s : ");
		milla= entrada.nextFloat();
		System.out.println("Digite el numero de lillas de -->(Vuelta) o retorno que recorre la embarcacion por hora-s");
		r= entrada.nextFloat();
		hmill =1200 / milla;
		pdias =hmill *1 / 24; 
		hr= 1200 / r;
		tr= hr * 1 / 24;
		
		System.out.println("");
		System.out.println(":::::Embarcacion #1:::::");
		System.out.println("El numero de horas que se tarda en recorer 1200 millas");
		System.out.println("Que es la distancia entre Buenos Aires y Rio de Janeiro (Brazil) es de "+hmill+" hora-s.");
		System.out.println("Se demoró "+pdias+" dia-s para recorrer 1200 millas de (Buenos Aires a Rio de Janeiro).");
		System.out.println("Se demora "+tr+" dia-s para recorrer 1200 millas de (Rio de Janeiro a Buenos Aires)");
		
	}

}
