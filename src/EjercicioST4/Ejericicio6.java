package EjercicioST4;

import java.awt.Choice;

import java.awt.FlowLayout;
import java.awt.Frame;


public class Ejericicio6 {
	Frame ventana = new Frame("Vehículos");
	Choice lista = new Choice();
	String[ ] provincias = {"Seleccione una provincia","Álava","Albacete","Alicante","Almería","Asturias","Ávila","Badajoz","Barcelona","Burgos","Cáceres",
			"Cádiz","Cantabria","Castellón","Ciudad Real","Córdoba","La Coruña","Cuenca","Gerona","Granada","Guadalajara",
			"Guipúzcoa","Huelva","Huesca","Islas Baleares","Jaén","León","Lérida","Lugo","Madrid","Málaga","Murcia","Navarra",
			"Orense","Palencia","Las Palmas","Pontevedra","La Rioja","Salamanca","Segovia","Sevilla","Soria","Tarragona",
			"Santa Cruz de Tenerife","Teruel","Toledo","Valencia","Valladolid","Vizcaya","Zamora","Zaragoza"};
	
	
	public Ejericicio6() {
		
		ventana.setLayout( new FlowLayout());
		ventana.setSize(450,150);
		ventana.add(lista);
		lista.add("Seleccione una provincia");
		for(int i = 0; i< provincias.length; i++){
		lista.add(provincias[i]);
		}
		
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new Ejericicio6();

	}

}
