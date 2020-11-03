package co.edu.campusucc;
import java.util.Scanner;
public class Ejercicio13 {
	static Scanner entrada = new Scanner(System.in);
	public static void main (String[] args) {
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
		
		
		System.out.println("::::Calvin y Hobbes:::::");
		System.out.println("");
		double unid1,unid2,unid3;
		String emp1;
		String emp2;
		
		System.out.println("Programa para calcular las unidades que produjo dos empleados.");
		System.out.println("La diferencia de un empleado y otro es de 2/3.");
		System.out.println("");
		System.out.println("Digite el nombre del empleado #1:");
		emp1:entrada.next();
		System.out.println("Digite la cantida que produjo el empleado  :");
		unid1 =entrada.nextDouble();
		System.out.println("");
		System.out.println("Digite el nombre del empleado #2:");
		emp2= entrada.next();
		System.out.println("Digite la cantida que produjo el empleado  :");
		unid2 =entrada.nextDouble();
		
		unid3 =unid1 + unid2;
		unid1 =unid2 - 2/3;
		unid2 =unid2 + unid1;
		
		System.out.println("La cantida de unidades de los dos empleados es de:"+unid3);
		System.out.println("La cantida que produjo el empleado #1 es de:"+unid1);
		System.out.println("La cantida que produjo el empleado #2 es de:"+unid2);
		
	}
	

}
