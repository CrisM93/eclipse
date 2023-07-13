
public class Antropologo implements Salariable, Trabajable {
	private String nombre;
	private int edad;
	private double salario;

	public Antropologo(String nombre, int edad, double a) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = a;
	}

	@Override
	public double getSalario() {

		return salario;
	}

	@Override
	public String getNombre() {

		return nombre;
	}

	@Override
	public String getEdad() {

		return "" + edad;
	}

}
