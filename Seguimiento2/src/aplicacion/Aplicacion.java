package aplicacion;

import interfaz.VentanaPrincipal;

/*
 * @author Santiago Gordillo Molina
 * 
 * Universidad del Quindio
 * Facultad de ingenieria 
 * ingenieria de sistemas y computacion
 */


public class Aplicacion {
	private VentanaPrincipal miVentanaPrincipal;

	public static void main(String[] args) {

	VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();

	miVentanaPrincipal.setBounds(100, 100, 300, 300);

	miVentanaPrincipal.setLocationRelativeTo(null);

	miVentanaPrincipal.setVisible(true);

	}

}
