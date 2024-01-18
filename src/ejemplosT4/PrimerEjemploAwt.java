package ejemplosT4;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class PrimerEjemploAwt {

	public static void main(String[] args) 
	{
		// Crear el contenedor (GUI)
		Frame ventana = new Frame("Titulo de la ventana");
		ventana.setTitle("Nuevo titulo");
		Button btnBoton = new Button("Aceptar");
		Button btnBoton2 = new Button("Cancelar");
		
		
		ventana.setLayout(new FlowLayout());
		ventana.add(btnBoton);
		ventana.add(btnBoton2);
		ventana.setSize(300, 200);
		ventana.setBackground(Color.CYAN);
		
		ventana.setVisible(true);

	}

}
