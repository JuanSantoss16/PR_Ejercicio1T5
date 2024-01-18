package EjercicioST4;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ejercicio5 {
	
	Frame ventana = new Frame("Vehículos");
	
	Panel pnlDatos = new Panel();
	Panel pnlBoton = new Panel();
	
	CheckboxGroup chgMotor = new CheckboxGroup();
	Checkbox chxDiesel = new Checkbox("Diésel",false, chgMotor);
	Checkbox chx3puertas = new Checkbox("3 puertas",false, chgMotor);
	Checkbox chx4puertas = new Checkbox("4 puertas",false, chgMotor);
	Checkbox chx5puertas = new Checkbox("5 puertas",false, chgMotor);
	Checkbox chxGasolina = new Checkbox("Gasolina");
	Checkbox chxHibrido = new Checkbox("Híbrido");
	Checkbox chxElectrico= new Checkbox("Electrico");
	Label lbl1 = new Label("Tipo de motorización");
	Label lbl2= new Label("Número de puertas");
	Label lbl3= new Label("Pintura metalizada");
	Checkbox chxSi = new Checkbox("Si",false, chgMotor);
	Checkbox chxNo = new Checkbox("No",false, chgMotor);
	Button btnCalcular = new Button("Calcular presupuesto");
	public Ejercicio5() {
		ventana.setLayout(new BorderLayout());
		ventana.setSize(450,150);
		
		pnlDatos.add(lbl1);
		pnlDatos.add(chxGasolina);
		pnlDatos.add(chxDiesel);
		pnlDatos.add(chxHibrido);
		pnlDatos.add(chxElectrico);
		pnlDatos.add(lbl2);
		pnlDatos.add(chx3puertas);
		pnlDatos.add(chx4puertas);
		pnlDatos.add(chx5puertas);
		pnlDatos.add(lbl3);
		pnlDatos.add(chxSi);
		pnlDatos.add(chxNo);
		pnlBoton.add(btnCalcular);
		
		ventana.add("Center", pnlDatos);
		ventana.add("South", pnlBoton);
		
		ventana.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Ejercicio5();

	}

}
