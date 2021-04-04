
public class ejercicio1 {
	public static void main (String[]args) {
		int a=52, b=754, c=5, mayor, L;
		mayor=a;
		L=a;
		if (b>mayor) {
			mayor=b;
		}else {
			if(b<L) L=b;
		}if (c>mayor) {
			mayor=c;
		}else {
			if (c<L) L=c;
		}
		System.out.println("Mayor: "+mayor);
		System.out.println("Menor: "+L);
	}
}
