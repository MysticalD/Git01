package Trabajo_Arrays;

public class Array01 {
	public static void main(String[] Args) { //metodo main
		
	//INICIO DECLARACION DE LA MATRIZ - ARRAY Y ALMACENAMIENTO DE LOS VALORES 
		
		int [] array1= new int[5]; //5 elementos 
		
		array1[0]=5; //posicion del almacenamiento de valores - tipo entero
		array1[1]=15;
		array1[2]=32;
		array1[3]=64;
		array1[4]=100;
		
	//FIN DECLARACION DE LA MATRIZ - ARRAY Y ALMACENAMIENTO DE LOS VALORES 
		
	//INICIO IMPRESION EN CONSOLA 
		
		for(int i=0;i<5;i++) { //impresion de todos los elementos con un bucle en limites 
		System.out.println("Valor del índice " + i + " = " + array1[i]);
	//FIN IMPRESINO EN CONSOLA
}
}
}