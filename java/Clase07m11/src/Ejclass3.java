import java.util.Scanner;
public class Ejclass3 {
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
		
		int ubi,tam;
		System.out.println(":::::::::::Tele-Sprinflil:::::::::::");
		System.out.println("");
		System.out.println("Su tarifa se determina por lugar y tamaño de televisor (TL).");
		System.out.println("Digite en numero para responder los siguentes datos.");
		System.out.println("Digite su ubicacion correspondiente.--> 1.Norte, 2.Sur, 3.Oriente, 4.Occidente:");
		ubi=entrada.nextInt();
		System.out.println("Digite el tamaño del Televisor(TV).---> 1.Pequeño, 2.Mediano, 3.Grande :");
		tam=entrada.nextInt();
		
		switch (ubi){
		case 1: 
			switch (tam){
				case 1:
					System.out.println("Su ubicacion es Sur y TV es Pequeño.");
					System.out.println("Su tarifa por minuto es de: $500");
					break;
				case 2:
					System.out.println("Su ubicacion es Sur y TV es Mediano.");
					System.out.println("Su tarifa por minuto es de: $250");
					break;
				case 3:
					System.out.println("Su ubicacion es Sur y TV es Grande.");
					System.out.println("Su tarifa por minuto es de: $100");
					break;
			}
		case 2:
			switch (tam){
			case 1:
				System.out.println("Su ubicacion es Sur y TV es Pequeño.");
				System.out.println("Su tarifa por minuto es de: $400");
				break;
			case 2:
				System.out.println("Su ubicacion es Sur y TV es Mediano.");
				System.out.println("Su tarifa por minuto es de: $200");
				break;
				default:
					System.out.println("El dato no corresponde. Porfavor intente de nuevo:( .");
		}
		case 3:
			switch (tam){
			case 3:
				System.out.println("Su ubicacion es Oriente y TV es Grande.");
				System.out.println("Su tarifa por minuto es de: $100");
				break;
				default:
					System.out.println("El dato no corresponde. Porfavor intente de nuevo :( .");
			}
			
		case 4:
			switch (tam) {
			case 1:
				System.out.println("Su ubicacion es Occidente y TV es Grande.");
				System.out.println("Su tarifa por minuto es de: $300");
				break;
			case 3:
				System.out.println("Su ubicacion es Occidente y TV es Grande.");
				System.out.println("Su tarifa por minuto es de: $200");
				break;
				
				default:
					System.out.println("El dato no corresponde. Porfavor intente de nuevo :( .");
			}
			break;
		default:
			System.out.println("El dato no corresponde :( .");
		}
		
	}
	

}
