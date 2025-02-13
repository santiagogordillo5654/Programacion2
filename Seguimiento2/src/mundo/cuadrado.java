package mundo;

/**
 * Esta clase representa un cuadrado
 * @author Santiago Gordillo Molina
 */
public class cuadrado {
	//-----------------------
	//Atributos
	//----------------------
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public cuadrado(double lado) {
		super();
		this.lado = lado;
	}
	
	public double calcularArea() {
		return lado*lado;
	}
}
