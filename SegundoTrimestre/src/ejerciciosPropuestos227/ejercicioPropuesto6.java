package ejerciciosPropuestos227;



public class ejercicioPropuesto6 {

	//EJERCICIO PROPUESTO 6
	
		//TENEMOS EL SIGUIENTE M�TODO QUE INDICA CUANDO UN N�MERO ES CAP�CUA O NO 
		//DESCUBRE POR QUE NO FUNCIONA 
	
	public static boolean esCapicua(int dato) {
		Integer i = new Integer(dato);
		String reverse = new StringBuffer(i.toString()).reverse().toString();
		return i.toString()==reverse.toString();
	}
}
