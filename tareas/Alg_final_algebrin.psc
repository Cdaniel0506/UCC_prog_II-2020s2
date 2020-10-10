Proceso algebrin
	//declaracion de variables 
	Definir a, d, c,p Como Real;
	a<-5; d<-3; c<-3;
	p=a+3;
	
	Escribir "la total de  panes es:",p;
	Escribir "panes de Algebrin :",a;
	Escribir "panes de Dividin :",d;
	//Proceso 

	a<-a *c;
	d<-d *c;
	Escribir "el total de panes de Algebrin, divididos en pedazos :",a;
	Escribir "el total de panes de Dividin, divididos en pedazos  :",d;
	Definir  s Como Real;
	s<-a+d;
	Escribir "el total de panes en pedazos es:",s;
	a<-a-p; //total de panes de Algebrin si se comio 8 pedazos de los 15 pedazos propios
	Escribir "nuevos total panes de algebrin es:",a;
	
	d<-d-p; //total de panes de Dividin  al comerse 8 pedasos
	Escribir "nuevo total de panes de Dividin es:",d;
	Definir m Como Entero;;
	m<- a+d; //m es el resultado de cuantos panes se comio el hombre rico
	
	Definir  v Como Logico;
	v <- Verdadero;
	m=8;
	si m=8  entonces
		v=verdadero;
		Escribir "Algebrin debe tener  monedas de oro:",a;
		Escribir "Dividin debe teber  moneda de oro:",d;

		
	FinSi
	v=falso;
	Escribir "Es justo y justificable las monedas que el Rico repartio";
FinProceso
