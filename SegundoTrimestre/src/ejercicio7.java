import java.util.Random;

public class ejercicio7 {
	public static void main (String[]args) {
		Random rnd=new Random();
		int valor=rnd.nextInt();
		valor=(valor%101);
		if (valor<0) valor=-1*valor;
		valor+=100;
		System.out.println(valor);
	}
}
