public class Ingeniero implements Salariable, Trabajable {
	private String nombre;
	private int edad;
	private double salario;

	public Ingeniero(String nombre, int edad, double a) {
		this.nombre = nombre;
		this.edad = edad;

		salario = a;// TODO Auto-generated constructor stub
	}

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
