package co.edu.campusucc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Menu01 {
	static Scanner entrada = new Scanner(System.in);
	private static Process theProcess;
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
		
		System.out.println("Digite --> 1 para el programa (Salario/Categoria).");
		System.out.println("Digite --> 2 para el programa (Numero al cubo).");
		System.out.println("Digite --> 3 para el programa (calcular dos numero y sacar promedio).");
		System.out.println("Digite --> 4 para el programa (calcular 3 notas, teniendo en cuenta que cada nota tiene un porcentaje).");
		try (Scanner scan= new Scanner (System.in)){
			int opcionPrograma=0;
			String comando= "";
			System.out.println("Digite el nùmero del preograma que desea ejecutar:");
			opcionPrograma= scan.nextInt();
			
			switch (opcionPrograma) {
			case 1:
				comando="java co.edu.campusucc clss1.java";
				break;
			case 2:
				comando="java co.edu.campusucc Ejercicio01.java";
			default:
				break;
			/*"java  co.edu.campusucc.Taller_M2_01"*/
			}
			try
			{
				theProcess = Runtime.getRuntime().exec("java co.edu.campusucc.Taller_M2_001.clss1.java");
				theProcess = null;
				BufferedReader inStream = new BufferedReader(new InputStreamReader(theProcess.getInputStream()));
				System.out.println(inStream.readLine());
				
			}
			catch (Exception e)
			{
				System.err.println("Error en el metodo exec ()");
				e.printStackTrace();
			}
			
			
		}
	}
}