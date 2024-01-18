package EjercicioST4;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ejercicio8 {
	
	Frame Ventana = new Frame("Menú");
	MenuBar barraMenu = new MenuBar();
	Menu mnuArticulos = new Menu("Articulos");
	MenuItem mniArticulosNuevo = new MenuItem("Nuevo Articulo");
	MenuItem mniArticulosEliminar = new MenuItem("Eliminar Articulo");
	MenuItem mniArticulosConsultar = new MenuItem("Consultars Articulo");

	
	public Ejercicio8() {
		
		Ventana.setLayout(new FlowLayout());
		
		
		mnuArticulos.add(mniArticulosNuevo);
		mnuArticulos.add(mniArticulosEliminar);
		mnuArticulos.add(mniArticulosConsultar);
		barraMenu.add(mnuArticulos);
		Ventana.setMenuBar(barraMenu);
		Ventana.setSize(400,125);
		
		
		
		Ventana.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new Ejercicio8();

	}

}
