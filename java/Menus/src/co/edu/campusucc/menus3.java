package co.edu.campusucc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menus3 {
	public static void main (String [] args) {
		Scanner entrada=new Scanner(System.in);
		boolean salir=false;
		int opcion=0;
		while(!salir) {
			System.out.println("Digite --> 1 para el programa (Nemero al cubo).");
			System.out.println("Digite --> 2 para el programa (false).");
			System.out.println("Digite --> 3 para el programa (calcular dos numero y sacar promedio).");
			System.out.println("Digite --> 4 para el programa (calcular 3 notas, teniendo en cuenta que c).");
			System.out.println("Salir");
			
			System.out.println("introduce el numero del proghrama a ejecutar:");
			opcion= entrada.nextInt();
			try (Scanner scan= new Scanner (System.in)){
				int opcionPrograma=0;
				String comando= "";
				System.out.println("Digite el nùmero del preograma que desea ejecutar:");
				opcionPrograma= scan.nextInt();
				
				switch (opcionPrograma) {
				case 1:
					System.out.println("DIgite el numero que desea calcular al cubo:");
					int n=scan.nextInt();
					menus2 op= new menus2();
					op.cubo(n);
					op.mostrarcubo();
					break;
				case 2:
					comando="java co.edu.campusucc Ej1.java";
					break;
				default:
					System.out.println("El numero de programa es null, por favor vuelva a intentar."
							+ "las opciones son de 1 a 7.");

				}
			}catch (InputMismatchException e) {
				System.out.println("Se debe colocar un numero :( .");
				entrada.next();
		}
		System.out.println("Final del programa Menu ;) ..");
		}
	}

}
