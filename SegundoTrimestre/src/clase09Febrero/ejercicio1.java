package clase09Febrero;

public class ejercicio1 {
public static int cuadrado(int fila, int columna/*declaracion de las variables*/) {
	if (columna==1) return 1; //si la columna es igual a 1 devuelve 1
	if(fila==1)return 1; //si la fila es igual a 1 devuelve 1
	return cuadrado(fila-1,columna)+cuadrado(fila,columna-1);
}
public static void main (String[]ags) {
	int numfilas=6;
	for (int i=1;i<(numfilas); i++) {
		
		for (int k=1;k<(numfilas);k++) {//bucle que sacar por la panatalla 
			int dato = cuadrado(i,k);
			if (dato>0) System.out.print(dato+" ");
			if (dato>=1&&dato<10) System.out.print(" ");
		}
		System.out.print("");//salto de linea
	}
}
}
