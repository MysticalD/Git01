package clase03Febrero;

public class ejercicio01 {
	public static void main(String[]args) {
		System.out.println("Verificar si un numero es Primo");
		int numero = 7;
		boolean esPrimo = verificarNumeroPrimo (numero);
		System.out.println("El numero" + numero + "es primo?" + esPrimo);
		
	}
	
	public static boolean verificarNumeroPrimo (int numero) {
		boolean esPrimo = false;
		int cantidadNumerosDivisibles = 0;
		int cantidadNumerosDivisiblesParaUnPrimo = 2;
		
		for(int i=1; i<= numero; i++)
			if (numero % i == 0)
				cantidadNumerosDivisibles ++;
		
		if(cantidadNumerosDivisibles == cantidadNumerosDivisiblesParaUnPrimo)
			esPrimo = true;
		return esPrimo;
	}
}
