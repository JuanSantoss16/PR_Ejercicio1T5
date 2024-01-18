package EjercicioST4;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio1 
{
	Frame ventana = new Frame("Par/ Impar");
	TextField txtNumero = new TextField(10);
	Label lbl1 = new Label("Introduzca la cantidad");
	Button btnCalcular = new Button("Calcular");
	Label lblResultado = new Label("		");
	
	public Ejercicio1() // Constructor
	{
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

}
