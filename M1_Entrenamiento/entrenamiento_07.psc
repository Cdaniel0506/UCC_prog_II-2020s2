Proceso sin_titulo
	// definir variables
	Definir N Como Entero;
	N<-10;
	Definir b Como Logico;
	b<- Verdadero;
	
	Definir dos Como Entero;

	Definir uno, tres Como Logico;
	// el error de este programa es por h no esta definida
	// la definimos
	Definir  h Como Caracter;
	h<-'h';
	uno <- b; dos<-N; // tres<-'h';
	si h ='h' entonces 
		tres = Verdadero;
	FinSi
	tres =falso;
	//salida
	Escribir " valor de b es de:",b;
	Escribir " valor de h es de:",h;
	Escribir  " valor de N es de:",N;
FinProceso
