package co.edu.campusucc;


/*Funciones con parametros*/

public class menus2 {
	int cubo;
	int promedio;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	public void cubo(int numero) {
		cubo=numero*numero*numero;
		
	}
	public void promedio(int numero1,int numero2) {
		 
		 promedio=( numero1 + numero2) / 2;
	}
	public void suma(int numer3,int numer4) {
		suma=(numer3 +numer4);
	}
	public void resta(int numero5,int numero6) {
		resta=numero5 - numero6;
	}
	public void multiplicacion(int numero7,int numero8) {
		resta=numero7 - numero8;
	}
	public void division(int numero9,int numero10) {
		division=numero9- numero10;
	}
public void mostrarcubo() {
	System.out.println("Su numero al cubo es: "+cubo);
}
public void mostrarpromedio() {
	System.out.println("Su numero con promedio es: "+promedio);
}
public void mostrarsuma() {
	System.out.println("La suma es:"+suma);
}
public void mostrarresta() {
	System.out.println("La resta es:"+resta);
}
public void mostrarmultiplicacion() {
	System.out.println("La multiplicacion es:"+multiplicacion);
}
public void mostrarmuldivision() {
	System.out.println("La division es:"+division);
}
}

