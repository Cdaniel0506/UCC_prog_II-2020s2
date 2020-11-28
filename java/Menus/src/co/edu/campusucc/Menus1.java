package co.edu.campusucc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menus1 {
	static Scanner entrada = new Scanner(System.in);
	public static void main (String[] args) {
		boolean salir=false;
		int opcion;
		
		System.out.println("__________$$$__________$$$__________$$$__________$$$__________$$$______$$$");
		System.out.println("|::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::|");
		System.out.println("|Universidad Cooperativa De Colombia	+CD_________________+CD0______	 |");
		System.out.println("|Profe:Harold Adrian                    _+CD0_______________++CD______   |");
		System.out.println("|                                       _++CD______________+CD0_______   |");
		System.out.println("|                                       _++CD_____________++CD________   |");
		System.out.println("|Estudiante:                            __+CD0___________++CD5________   |");
		System.out.println("|Carlos Daniel Balanta Herrera          __+CD5_________++CD0__________   |");
		System.out.println("|Ingenieria De Sistemas                 __++CD0_______++CD0___________   |");
		System.out.println("|                                       __++CD5_____+++CD0____________   |");
		System.out.println("|                                       __++CDCD__+++CDCD++55_________   |");
		System.out.println("|Curos:                                 __+++CDCD+++CDCD++CDCD________   |");
		System.out.println("|Herm.Comp.Interp.Resltado-2020s2       ___++555CD5555CD++CDCD5+50____   |");
		System.out.println("|                                       ___++55++5555++5555555++555___   |");
		System.out.println("|                                       ____++++++CDCDCDCDCDCDCDCD5___   |");
		System.out.println("|Email:                                 ____++++++++000CDCDCDCDCDCD___   |");
		System.out.println("|carlos2000.cdb@gmail.com               _____+++++++0000CDCDCDCDCDCD__   |");
		System.out.println("|                                       ______+++++++000CDCDCDCDCD5___   |");
		System.out.println("|                                       _______+++++++0CDCDCDCDCD5____   |");
		System.out.println("|                                       _______+++++++0CDCDCDCDCD5____   |");
		System.out.println("|                                       ________+++++++CDCDCDCDCD_____   |");
		System.out.println("|                                       ________+++++++00CDCDCDCD_____   |");
		System.out.println("|                                       ________++++++00CDCDCDCD______	 |");
		System.out.println("|::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::|");
		System.out.println("__________$$$__________$$$__________$$$__________$$$__________$$$______$$$");
		while(!salir) {
			System.out.println("");
			System.out.println("*__________________MENU___________________MENU__________________MENU_________________*");
			System.out.println("|Digite --> 1 para el programa (Numero Al Cubo).");
			System.out.println("|Digite --> 2 para el programa (Numero conpromedio).");
			System.out.println("|Digite --> 3 para el programa (Suma).");
			System.out.println("|Digite --> 4 para el programa (Resta).");
			System.out.println("|Digite --> 5 para el programa (Multiplicacion).");
			System.out.println("|Digite --> 6 para el programa (Division).");
			System.out.println("|Digite --> 7 para salir.");
			System.out.println("*___________________***____________________***___________________***__________________*");
			try {
				System.out.println("Digite el nùmero del preograma que desea ejecutar:");
				opcion= entrada.nextInt();
				
				switch (opcion) {
				case 1:
					System.out.println("DIgite el numero que desea calcular al cubo:");
					int n=entrada.nextInt();
					menus2 op= new menus2();
					op.cubo(n);
					op.mostrarcubo();
					break;
				case 2:
					System.out.println("Digite dos numeros a sacar promedio.");
					System.out.println("Ingrese el primer numero:");
					int n1=entrada.nextInt();
					System.out.println("Ingrese el segundo numero:");
					int n2=entrada.nextInt();
					menus2 op1=new menus2();
					op1.promedio(n1,n2);
					op1.mostrarpromedio();
					break;
				case 3:
					System.out.println("Digite dos numeros a Sumar.");
					System.out.println("Ingrese el primer numero:");
					int n3=entrada.nextInt();
					System.out.println("Ingrese el segundo numero:");
					int n4=entrada.nextInt();
					menus2 op2=new menus2();
					op2.suma(n3,n4);
					op2.mostrarsuma();
					break;
				case 4:
					System.out.println("Digite dos numeros a Restar.");
					System.out.println("Ingrese el primer numero:");
					int n5=entrada.nextInt();
					System.out.println("Ingrese el segundo numero:");
					int n6=entrada.nextInt();
					menus2 op3=new menus2();
					op3.resta(n5,n6);
					op3.mostrarresta();
					break;
				case 5:
					System.out.println("Digite dos numeros a Multiplicar.");
					System.out.println("Ingrese el primer numero:");
					int n7=entrada.nextInt();
					System.out.println("Ingrese el segundo numero:");
					int n8=entrada.nextInt();
					menus2 op4=new menus2();
					op4.multiplicacion(n7,n8);
					op4.mostrarmultiplicacion();
					break;
				case 6:
					System.out.println("Digite dos numeros a Dividir.");
					System.out.println("Ingrese el primer numero:");
					int n9=entrada.nextInt();
					System.out.println("Ingrese el segundo numero:");
					int n10=entrada.nextInt();
					menus2 op5=new menus2();
					op5.division(n9,n10);
					op5.mostrarmuldivision();
					
				
					break;
				case 7:
					salir=true;
					break;
				default:
					System.out.println("El numero de programa es null, por favor vuelva a intentar."
							+ "las opciones son de 1 a 7.");

				}
			}catch (InputMismatchException e) {
				System.out.println("Se debe colocar un numero :( .");
				entrada.next();
			}
		}System.out.println("Final del programa Menu ;) ..");
		
	}
}


