package clase02Febrero;

public class rectangulo1 {
	private int ancho=1;
	private int alto=2;
	rectangulo1(int an, int all){
		ancho=an;
		this.alto=all;
	}
	public int getAncho() {return this.ancho;}
	public int getAlto() {return alto;}
	public rectangulo1 incrementarAncho() {
		ancho++;
		return this;
	}
	public rectangulo1 incrementarAlto() {
		this.alto++;
		return this;
	}
}
