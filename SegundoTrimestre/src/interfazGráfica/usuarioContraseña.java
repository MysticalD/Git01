package interfazGráfica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class usuarioContraseña extends JFrame {

	private JPanel contentPane;
	private JLabel lblFondo;
	private JLabel lbltituloPrincipal;
	private JLabel lblTriangulo;
	private JLabel lblBase;
	private JLabel lblAltura;
	private JTextField texBase;
	private JTextField textAltura;
	private JButton btnCalculador;
	private JMenuBar menuBarOpciones;
	private JMenuItem mntmNewMenuItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					usuarioContraseña frame = new usuarioContraseña();
					frame.setVisible(true);
					
					frame.setLocationRelativeTo(null); //aquí centraremos la ventana
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public usuarioContraseña() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		{
			menuBarOpciones = new JMenuBar();
			setJMenuBar(menuBarOpciones);
			{
				mntmNewMenuItem = new JMenuItem("Salir :)");
				menuBarOpciones.add(mntmNewMenuItem);
			}
		}
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			btnCalculador = new JButton("\u00A1Calcular! :D");
			btnCalculador.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					double base = Double.parseDouble(texBase.getText()); //nos capturara el valor que esta en el cuadro, lo que el uasuario digite
					double altura = Double.parseDouble(textAltura.getText()); //lo mismo pero del siguiente cuadro de altura
					double area=0;
					
					area=base*altura/2; //formula para calcular el area de un triangulo
					
					JOptionPane.showMessageDialog(null, "El area del triángulo es: "+area+ " m²"); //mensaje final (resultado) al usuario
				}
			});
			btnCalculador.setFont(new Font("Tahoma", Font.PLAIN, 17));
			btnCalculador.setBounds(285, 188, 127, 29);
			contentPane.add(btnCalculador);
		}
		{
			texBase = new JTextField();
			texBase.setBounds(348, 105, 76, 20);
			contentPane.add(texBase);
			texBase.setColumns(10);
		}
		{
			textAltura = new JTextField();
			textAltura.setColumns(10);
			textAltura.setBounds(348, 150, 76, 20);
			contentPane.add(textAltura);
		}
		{
			lblAltura = new JLabel("Altura:");
			lblAltura.setForeground(Color.WHITE);
			lblAltura.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
			lblAltura.setBounds(265, 141, 76, 35);
			contentPane.add(lblAltura);
		}
		{
			lblBase = new JLabel("Base:");
			lblBase.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
			lblBase.setForeground(Color.WHITE);
			lblBase.setBounds(265, 92, 84, 35);
			contentPane.add(lblBase);
		}
		{
			lblTriangulo = new JLabel("New label");
			lblTriangulo.setIcon(new ImageIcon("C:\\Users\\olema\\OneDrive\\Documentos\\Daw\\Programacion\\Segundo Trimestre\\Tema 5\\Trabajo de investigaci\u00F3n\\Imagenes\\0bf551cd33da81af59a7516a776fb6c2.jpg"));
			lblTriangulo.setBounds(20, 70, 235, 186);
			contentPane.add(lblTriangulo);
		}
		{
			lbltituloPrincipal = new JLabel("\u00C1rea del Tri\u00E1ngulo");
			lbltituloPrincipal.setFont(lbltituloPrincipal.getFont().deriveFont(30f));
			lbltituloPrincipal.setForeground(Color.WHITE);
			lbltituloPrincipal.setBounds(100, 11, 261, 62);
			contentPane.add(lbltituloPrincipal);
		}
		{
			lblFondo = new JLabel("New label");
			lblFondo.setForeground(Color.BLACK);
			lblFondo.setIcon(new ImageIcon("C:\\Users\\olema\\OneDrive\\Documentos\\Daw\\Programacion\\Segundo Trimestre\\Tema 5\\Trabajo de investigaci\u00F3n\\Imagenes\\79421985-modelo-poligonal-incons\u00FAtil-azul-de-ne\u00F3n-fondo-oscuro-con-ne\u00F3n-azul-tecnolog\u00EDa-moderna-rejilla-triangular-.jpg"));
			lblFondo.setBounds(10, 0, 434, 261);
			contentPane.add(lblFondo);
		}
	}
}
