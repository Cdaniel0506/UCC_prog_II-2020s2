package co.edu.campusucc;
import java.util.Scanner;

public class Ejercicio04 {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String [] args) {
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
		
		
		float salario ;
		float desc;
		String empleado;
		float salariofn;

		System.out.println("::::Programa para calcular el salario con descuento::::");
		System.out.println("");
		System.out.println("Digite el nombre del empleado:");
		empleado = entrada.next();
		System.out.println("");
		System.out.println("Ingrese el salario a pagar :");
		salario = entrada.nextFloat();
		System.out.println("");
		System.out.println("Digite el valor a descontar del empleado:");
		desc = entrada.nextFloat();
		System.out.println("");
		salariofn = salario - desc;
		System.out.println("_____$$$$$$$$____");
		
		System.out.println("El valor a paga a "+empleado+"   es:"+ salariofn);
				
	}

}
