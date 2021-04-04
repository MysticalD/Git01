package examen.utilidades; //PAQUETE NOMBRE DEL EXAMEN 

public class consumo { //NOMBRE DE LA CLASE 
	
	//INICIO DE INICIALIZACION - PRIMERA PARTE 
	
		public static void main (String[]args) {
			double a=9.95; //inicializar los valores 
			double b=(0.025)*3;
	
	//FIN DE LA INICIALIZACION - PRIMERA PARTE 	
	
	//INICIO DE LAS CONJUNCIONES - SEGUNDA PARTE 
			
		gas gas1=new gas();//se le da un nombre 
		gas1.gas(a, b);
		
	//FIN DE LAS CONJUNCIONES - SEGUNDA PARTE 
		
	//INICIO DE LA IMPRESION EN CONSOLA 
		
		System.out.println("La suma es: \n" + gas1.gas(a, b)); //la suma se mostrara en pantalla
		System.out.println();
		System.out.println("ADEMAS");
		System.out.println();
		agua agua1=new agua(); //nombre asignado a agua 
		agua1.agua(a,b);
		System.out.print("El total: "+a+ "\npotenciado en: "+b+ "\nda como resultado:"); //resultado 
	}
}
	//FIN DE LA IMPRESION EN CONSOLA  - SEGUNDA PARTE