package co.edu.campusucc;
import java.util.Scanner;
public class Ejercicio14 {
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
		System.out.println("");
		
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
		
		float hmillp,millap,pdiasp,rp,trp,hrp;
		System.out.println(":::::::--: Tres embarcaciones::::::");
		System.out.println("");
		System.out.println(":::::Embarcacion #2:::::");
		System.out.println("Nota: la distancia que tendran que pasar las 3 embarcaciones es de unas 1200 millas.");
		System.out.println("");
		System.out.println("Digite el numero de milla-s de -->(ida) que recorre la embarcacion por hora-s : ");
		millap= entrada.nextFloat();
		System.out.println("Digite el numero de lillas de -->(Vuelta) o retorno que recorre la embarcacion por hora-s");
		rp= entrada.nextFloat();
		hmillp =1200 / millap;
		pdiasp =hmillp *1 / 24; 
		hrp= 1200 / r;
		trp= hrp * 1 / 24;
		
		float hmills,millas,pdiass,rs,trs,hrs;
		System.out.println(":::::::--: Tres embarcaciones::::::");
		System.out.println("");
		System.out.println(":::::Embarcacion #3:::::");
		System.out.println("Nota: la distancia que tendran que pasar las 3 embarcaciones es de unas 1200 millas.");
		System.out.println("");
		System.out.println("Digite el numero de milla-s de -->(ida) que recorre la embarcacion por hora-s : ");
		millas= entrada.nextFloat();
		System.out.println("Digite el numero de lillas de -->(Vuelta) o retorno que recorre la embarcacion por hora-s");
		rs= entrada.nextFloat();
		hmills =1200 / millas;
		pdiass =hmills *1 / 24; 
		hrs= 1200 / rs;
		trs= hrs * 1 / 24;
		
		
		System.out.println("");
		System.out.println(":::::Embarcacion #1:::::");
		System.out.println("El numero de horas que se tarda en recorer 1200 millas");
		System.out.println("Que es la distancia entre Buenos Aires y Rio de Janeiro (Brazil) es de "+hmill+" hora-s.");
		System.out.println("Se demoró "+pdias+" dia-s para recorrer 1200 millas de (Buenos Aires a Rio de Janeiro).");
		System.out.println("Se demora "+tr+" dia-s para recorrer 1200 millas de (Rio de Janeiro a Buenos Aires)");
		System.out.println("");
		System.out.println(":::::Embarcacion #2:::::");
		System.out.println("El numero de horas que se tarda en recorer 1200 millas");
		System.out.println("Que es la distancia entre Buenos Aires y Rio de Janeiro (Brazil) es de "+hmillp+" hora-s.");
		System.out.println("Se demoró "+pdiasp+" dia-s para recorrer 1200 millas de (Buenos Aires a Rio de Janeiro).");
		System.out.println("Se demora "+trp+" dia-s para recorrer 1200 millas de (Rio de Janeiro a Buenos Aires)");
		System.out.println("");
		System.out.println(":::::Embarcacion #3:::::");
		System.out.println("El numero de horas que se tarda en recorer 1200 millas");
		System.out.println("Que es la distancia entre Buenos Aires y Rio de Janeiro (Brazil) es de "+hmills+" hora-s.");
		System.out.println("Se demoró "+pdiass+" dia-s para recorrer 1200 millas de (Buenos Aires a Rio de Janeiro).");
		System.out.println("Se demora "+trs+" dia-s para recorrer 1200 millas de (Rio de Janeiro a Buenos Aires)");
			}
	

}
