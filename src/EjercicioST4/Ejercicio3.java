package EjercicioST4;

import java.awt.Button;
import java.awt.Color;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio3 {
	
	Frame ventana = new Frame("Conversión de temmperaturas");
	Label lbl1 = new Label("Celsius");
	Label lbl2 = new Label("Fahrenheit");
	TextField txtNumero1 = new TextField(20);
	TextField txtNumero = new TextField(20);
	Button btnCalcular = new Button("Celsius a Fahrenheit");
	Button btnCalcular2 = new Button("Fahrenheit a Celsius");
	

	public Ejercicio3 () {
		ventana.setSize(400,150); // Ancho, Alto
		ventana.setLayout(new GridLayout(3,2)); // Distribución
		ventana.setResizable(false); // Para que no se pueda redimensionar
		ventana.setBackground(Color.yellow);
		ventana.setLocationRelativeTo(null); // Para que aparezca en el centro
		
		ventana.add(lbl1);
		ventana.add(txtNumero);
		ventana.add(lbl2);
		ventana.add(txtNumero1);
		ventana.add(btnCalcular);
		ventana.add(btnCalcular2);
		
		
		ventana.setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		new Ejercicio3();

	}

}
