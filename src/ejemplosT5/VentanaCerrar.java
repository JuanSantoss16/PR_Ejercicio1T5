package ejemplosT5;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class VentanaCerrar implements WindowListener {
	
	Frame ventana = new Frame("Ventana que se cierra!");
	
	
	public VentanaCerrar() {
		
	ventana.setSize(450,200);
	ventana.addWindowListener(this);
	ventana.setLocationRelativeTo(null);
	ventana.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Open/Ventana abierta!");

		new VentanaCerrar();
	}
	@Override
	public void windowOpened(WindowEvent e) {

		System.out.println("Open/Ventana abierta!");
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Se cerró");
		System.exit(0);
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Cerrada");
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Minimiza");
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Resturada");
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Activada");
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Desactivada");
		
	}

}
