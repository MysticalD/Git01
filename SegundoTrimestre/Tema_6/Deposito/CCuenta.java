package Deposito;

public class CCuenta {
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    private float operativa_cuenta;//float
    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo, float Opera_cuen) //agregamos la variable tipo float
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    public void operativa_cuenta(float cantidad){//public void 
}
}