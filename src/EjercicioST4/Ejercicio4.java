package EjercicioST4;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

import java.awt.Label;

public class Ejercicio4 {
	
	Frame ventana = new Frame("Aficiones");
	Button btnCalcular = new Button("Comprobar");
	
	Checkbox chx1 = new Checkbox("Correr");
	Checkbox chx2 = new Checkbox("Nadar");
	Checkbox chx3 = new Checkbox("Andar");
	Checkbox chx4 = new Checkbox("Leer");
	Checkbox chx5 = new Checkbox("Ir al cine");
	Checkbox chx6 = new Checkbox("Bailar");
	Checkbox chx7 = new Checkbox("Fútbol.");
	Checkbox chx8 = new Checkbox("Tenis");
	Checkbox chx9 = new Checkbox("Baloncesto");
	Checkbox chx10 = new Checkbox("Deportes de vela");
	
	// AÑADIMOS COSAS
	
	
	public Ejercicio4() {
		ventana.setSize(400,150); // Ancho, Alto
		ventana.setLayout(new FlowLayout()); // Distribución
		ventana.setResizable(false); // Para que no se pueda redimensionar
		ventana.setBackground(Color.yellow);
		ventana.setLocationRelativeTo(null); // Para que aparezca en el centro
		
		ventana.add(chx1);
		
		ventana.add(chx2);
		
		ventana.add(chx3);
		
		ventana.add(chx4);
		
		ventana.add(chx5);
		
		ventana.add(chx6);
		
		ventana.add(chx7);
		
		ventana.add(chx8);
		
		ventana.add(chx9);
		
		ventana.add(chx10);
		
		
		
		ventana.add(btnCalcular);
		
		
		
		ventana.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Ejercicio4();

	}

}
