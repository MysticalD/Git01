import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio5 {
	public static int getNumber() {
		int d, m, y;
		d=m=y=0;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader buff=new BufferedReader(isr);
		try {
			System.out.println("Introduzca Día: ");
			String In=buff.readLine();
			d=Integer.parseInt(In);
			System.out.println("Introduzca Mes: ");
			In=buff.readLine();
			m=Integer.parseInt(In);
			System.out.println("Introduzca Año :");
			In=buff.readLine();
			y=Integer.parseInt(In);			
		}catch(IOException e) {
			System.err.print("Se ha producido una IOExeption");
			e.printStackTrace();
		}return (d+m+y);
	}public static int reduce (int dato) {
		int sum=0;
		String cad=String.valueOf(dato);
		for (int i=0;i<cad.length();i++) {
			sum+=Integer.parseInt(cad.substring(i,i+1).trim());
		} return sum;
	} public static void main (String[]args) {
		int dato= getNumber();
		while (dato>9) {
			dato=reduce (dato);
		}
		System.out.println("Tu numero de la suerte es: "+dato);
}
	}
	
