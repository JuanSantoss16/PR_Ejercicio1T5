package EjercicioST4;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio2 {
	
	Frame ventana = new Frame("Calcular el IVA");
	Label lbl1 = new Label("Introduzca la cantidad");
	Label lbl2 = new Label("Introduzca el porcentaje");
	Label lbl3 = new Label("Resultado");
	TextField txtNumero = new TextField(10);
	TextField txtNumero1 = new TextField(10);
	TextField txtNumero2 = new TextField(20);
	Button btnCalcular = new Button("Calcular");
	Label lblResultado = new Label("		");

	
public Ejercicio2() {
	ventana.setSize(1000,80); // Ancho, Alto
	ventana.setLayout(new FlowLayout()); // Distribución
	ventana.setResizable(false); // Para que no se pueda redimensionar
	ventana.setBackground(Color.yellow);
	ventana.setLocationRelativeTo(null); // Para que aparezca en el centro
	
	// AÑADIMOS BOTONES
	ventana.add(lbl1);
	ventana.add(txtNumero1);
	ventana.add(lbl2);
	ventana.add(txtNumero);
	ventana.add(btnCalcular);
	ventana.add(lbl3);
	txtNumero2.setEnabled(false);
	ventana.add(txtNumero2);
	
	
	
	ventana.setVisible(true);
	
	
	
	
}
	public static void main(String[] args)
	{
		new Ejercicio2();

	}

}
