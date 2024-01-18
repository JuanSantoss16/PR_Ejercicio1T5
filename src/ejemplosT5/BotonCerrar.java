package ejemplosT5;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonCerrar implements ActionListener
{

	Frame ventana = new Frame("Ventana que se cierra!");
	Button btnCerrar = new Button ("Cerrar Ventana!");
	
	public BotonCerrar(){
		
		
		
		ventana.setLocationRelativeTo(null);
		btnCerrar.addActionListener(this);
		ventana.add(btnCerrar);
		
		ventana.setSize(1000,80); // Ancho, Alto
		ventana.setLayout(new FlowLayout());
		ventana.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		
		new BotonCerrar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}

}
