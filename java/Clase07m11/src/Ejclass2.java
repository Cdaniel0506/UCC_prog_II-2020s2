import java.util.Scanner;

public class Ejclass2 {
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
		
		System.out.println(":::::::::::Universidad:::::::::::");
		System.out.println("");
		System.out.println("Cobro de tarifa por carnet (");
		System.out.println("");
		
		String nom;
		float eco,adm,cie,carnet;
		int sem,car;
		
		System.out.println("Digite su nombre:");
		nom=entrada.next();
		System.out.println("Digite en numero los siguientes datos.");
		System.out.println("Digite el semestre en que se encuentra (1, 2, 3, 4...10.):");
		sem=entrada.nextInt();
		System.out.println("1.(Economia), 2.(Administracion), 3.(Ciencias)_ ");
		System.out.println("Digite el numero de su Carrera:");
		car=entrada.nextInt();
		
		switch (sem) {
		case 1:
			switch (car) {
			case 1:
				eco=1500; 
				System.out.println("Valos de "+nom+" por concepto de carnet es "+eco);
				break;
			case 2:
				adm=2000;
				System.out.println("Valor de "+nom+" por concepto de carnet es "+adm);
				break;
			case 3:
				cie=1800;
				System.out.println("Valor de "+nom+" por concepto de carnet es "+cie);
				break;
			
			}
						default:
				System.out.println("");
				System.out.println("Dato no existe -->is null :( ");
		}
		System.out.println("::::::::::::::::");
	
	}	
}
