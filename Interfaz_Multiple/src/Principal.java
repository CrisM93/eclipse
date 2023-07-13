
public class Principal {

	public static void main(String[] args) {

		Ingeniero ing = new Ingeniero("Pedro", 22, 1500);
		System.out.println(ing.getNombre() + " ," + ing.getEdad() + " Salario: ," + ing.getSalario());

		Antropologo antrop = new Antropologo("Juan", 25, 3400);
		System.out.println(antrop.getNombre() + " , " + antrop.getEdad() + " Salario: ," + antrop.getSalario());
		
		Mariachi mariac =new Mariachi("Martin", 29, 2500);
		System.out.println(mariac.getNombre() + " , " + mariac.getEdad() + " Salario: ," + mariac.getSalario());

	}

}
