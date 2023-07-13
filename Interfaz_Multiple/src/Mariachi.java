
public class Mariachi implements Salariable, Trabajable {
	private String name;
	private int edad;
	private double salario;

	Mariachi(String name, int edad, double salario) {
		this.name = name;
		this.edad = edad;
		this.salario = salario;
	}

	@Override
	public String getNombre() {
		return this.name;
	}

	@Override
	public String getEdad() {
		return "" + this.edad;
	}

	@Override
	public double getSalario() {

		return this.salario;
	}

}
