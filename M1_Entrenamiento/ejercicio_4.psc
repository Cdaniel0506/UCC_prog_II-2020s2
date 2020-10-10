Proceso ejercicio
	
	Definir r1,r2,r3,r4 Como Entero;
	Definir k Como Logico;
	Escribir "Benjamin Franklin invento el pararrayos[0]..falso,[1]..verdad?";
	Leer  r1;
	Escribir "¿Samuel morse invento el telegrafo[0]..falso,[1]..verdad";
	Leer r2;
	Escribir "Peru es un pais suramericano [0]..falso.[1]..verdad";
	Leer r3;
	Escribir "5 es un numero primo.[0]..falso,[1]...verdad?";
	Leer  r4;
	k<-(r1>=r2) y (r3 =r4);
	si (r1>=r2) y (r3 =r4) Entonces
		k=Verdadero;  
	FinSi
	k=Falso;
	Escribir  "El valor final vale:",k;
	
FinProceso
