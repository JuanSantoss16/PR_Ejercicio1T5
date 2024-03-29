package ejerciciosT5;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio1 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Par/ Impar");
	TextField txtNumero = new TextField(10);
	Label lbl1 = new Label("Introduzca la cantidad");
	Button btnCalcular = new Button("Calcular");
	Label lblResultado = new Label("	                     	");
	
	public Ejercicio1() // Constructor
	{
		ventana.addWindowListener(this);
		btnCalcular.addActionListener(this);
		ventana.setSize(300,80); // Ancho, Alto
		ventana.setLayout(new FlowLayout()); // Distribución
		ventana.setResizable(false); // Para que no se pueda redimensionar
		ventana.setBackground(Color.yellow);
		ventana.setLocationRelativeTo(null); // Para que aparezca en el centro
		
		//AÑADIMOS LOS ELEMENTOS
		ventana.add(txtNumero);
		ventana.add(btnCalcular);
		ventana.add(lblResultado);
		
		ventana.setVisible(true);
	}
	
	
	public static void main(String[] args) {

		new Ejercicio1();
		
	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// Coger el numero escrito
			int numero = Integer.parseInt(txtNumero.getText());
		
		// Comprobar si es Par o Impar
			String mensaje = "";
			if(numero %2 == 0) {
				mensaje = "Es par";
						
			}
			else {
				mensaje = "Es impar";
			}
		// Mostrar resultado
			lblResultado.setText(mensaje);
		
	}

}
