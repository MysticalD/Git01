package Controladores_De_Eventos;

//IMPORTACION DE LAS LIBREARIAS QUE HAY QUE USAR EN EL CODIGO 
import java.awt.event.ActionListener; //<- interface (abstracta) - no se puede crear objetos
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel; 
import javax.swing.JTextField; 


	//si no se importan crearán errores en el codigo y no nos permitirá ejecutarlo

public class Evento1 extends JFrame{ //agegamos "extends JFrame ya que haremos que herede y lo pondremos todo en una ventana 
	
	public Evento1() { //constructor de la clase (se debe de llamar igual que la clase

		//INICIO CREACION DEL MENSAJE INICIAL -> INDICACIÓN AL USUARIO
		
			JLabel pideMensaje=new JLabel("¡Hola! Valioso miembro. Introduce tu nombre :D"); //creación de la etiqueca con un "JLabel"
			pideMensaje.setBounds(70,20,300,35); //asignación del tamaño (con el metodo "SerBounds" y posicion mediante coordenadas 
		
		//FIN CREACION DEL MENSAJE -> INDICACIÓN AL USUARIO
		
		
		//INICIO CREACION DEL CUADRO DE ESCRITURA PARA EL USUARIO 
			
			JTextField campo=new JTextField(150); //campo de texto (inicialmete vacío)
			campo.setBounds(100,60,180,30); //asignación de las dimensiones
		
		//FIN DE LA CREACION DEL CUADRO DE ESCRITURA PARA EL USUARIO 	
			
			
		//INICIO DE LA CREACION DEL BOTON (INTERACCION DEL USUARIO CON LA VENTANA)
			
			JButton boton=new JButton("Ingresar");
			boton.setBounds(110,140,150,30);
			
		//FIN DE LA CREACION DEL BOTON 
			
		//INICIO DE LA MUESTRA FINAL DEL MENSAJE
			
			JLabel muestraMensaje=new JLabel(); //nos mostrara lo que ingresemos en el campo 
			muestraMensaje.setBounds(90,200,300,100);
			
		//FIN DE LA MUESTRA FINAL DEL MENSAJE
			
			
	//nuestro boton invocará un metodo llamado "ActionListener"
			
		//INICIO DE LA INVOCACION DEL ESCUCHADOR 
			
			ActionListener escuchador=new ActionListener(){ //creacion del metodo que acepta un objeto tipo "LISTENER"
			
				//IMPLEMENTACION DEL METODO ABSTRACT
				
				@Override //notacion que significa que es sobreescrito el metodo
			    
				public void actionPerformed(ActionEvent e) {
					
					muestraMensaje.setText("Bienvenid@ a Gamer`s Zone :) "+campo.getText());
					
				}
				};
			boton.addActionListener(escuchador); //se le agrega un escuchador al boton 
			
		//FIN DE LA INVOCACION DEL ESCUCHADOR 
			
		//INICIO DE LA CREACION DE LA VENTANA
			
			add(muestraMensaje);
			add(pideMensaje);
			add(campo);
			add(boton);
			setSize(400,400); //tamaño que se le va a dara la ventana
			setLayout(null); //desactivacion del Serialjob
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cuando le damos cerrar a la ventana paraliza el programa
			setVisible(true); //
			
			//FIN DE LA CREACION DE LA VENTANA 
}
	public static void main(String[]ar)
	{
		new Evento1();
	}
	
}