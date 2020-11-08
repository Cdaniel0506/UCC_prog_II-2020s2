import java.util.Scanner;
public class Ejclass4 {
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
		
		float und,fact,fac1,fac2,fac3;
		int cod;
		System.out.println(":::::::::::Pilitos:::::::::::");
		System.out.println("");
		System.out.println("Programa para calcular la factura.");
		System.out.println("Digite el codigo del producto. 1.A, 2.B, 3.C :");
		cod=entrada.nextInt();
		System.out.println("Digite la cantidad de unidades:");
		und=entrada.nextFloat();
		if(und <=500) {
			switch (cod) {
			case 1:fac1=500;
			fact =fac1 *7 /100;
			System.out.println("El valor de la factura es de:$ "+fact);
			break;
			case 2: fac2=800;
			fact=fac2 *8 /100;
			System.out.println("El valor de la factura es de:$ "+fact);
			break;
			case 3: fac3=1000;
			fact=fac3 *5 /100;
			System.out.println("El valor de la factura es de:$ "+fact);
			break;
			
			default:
				System.out.println("El dato no corresponde:::XXXXXXXX");
			}
		}
			else if(und >= 501) {
			switch (cod) {
			case 1:fac1=1000;
			fact =fac1 *9 /100;
			System.out.println("El valor de la factura es de:$ "+fact);
			break;
			case 2: fac2=1400;
			fact=fac2 *11 /100;
			System.out.println("El valor de la factura es de:$ "+fact);
			break;
			case 3: fac3=1600;
			fact=fac3 *10 /100;
			System.out.println("El valor de la factura es de:$ "+fact);
			break;
			
			default:
				System.out.println("El dato no corresponde:::XXXXXXXX");
			
		}
		}
		
		else {
			System.out.println("Dato null XXXXXXXX.");
		}
		
		
		
		
	}
}
