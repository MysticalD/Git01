package Utilidades;

import javax.swing.JOptionPane;

public class ejercicio4 {
public static void main (String[]args) {
	String entrada=JOptionPane.showInputDialog("Introduce el primero número :)");
	int numero1=Integer.parseInt(entrada);
	String entrada2=JOptionPane.showInputDialog("Introduce el segundo numero :(");
	int numero2=Integer.parseInt(entrada2);;
	sumar st=new sumar();
	st.suma(numero1, numero2);
	System.out.println("La suma es:"+ st.suma(numero1,numero2));
	potenciar pt=new potenciar();
	pt.potencia(numero1, numero2);
	System.out.println("El valor de "+numero1+" evelevado a "+numero2+ " es igual a:"+pt.potencia(numero1, numero2));
}
}
