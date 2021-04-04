package ejerciciosPropuestos227;



public class ejercicioPropuesto6 {

	//EJERCICIO PROPUESTO 6
	
		//TENEMOS EL SIGUIENTE MÉTODO QUE INDICA CUANDO UN NÚMERO ES CAPÍCUA O NO 
		//DESCUBRE POR QUE NO FUNCIONA 
	
	public static boolean esCapicua(int dato) {
		Integer i = new Integer(dato);
		String reverse = new StringBuffer(i.toString()).reverse().toString();
		return i.toString()==reverse.toString();
	}
}
