
public class ejercicio3 {
	public static void main (String[]args) {
		//Parte de arriba
		for (int i=1; i<5; i++) {
			int estrellas=2*i-1;
			int espacios=4-i;
			for (int j=0; j<espacios; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<estrellas; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		//Parte de abajo
		for (int i=3; i>0; i--) {
			int estrellas=2*i-1;
			int espacios=4-i;
			for (int j=0; j<espacios; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<estrellas; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
