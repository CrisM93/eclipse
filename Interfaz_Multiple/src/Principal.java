
public class Principal {

	public static void main(String[] args) {
		
Ingeniero ing=new Ingeniero("Pedro",22,1500);
System.out.println(ing.getNombre()+" ,"+ing.getEdad()+" Salario: ,"+ing.getSalario());
Antropologo antrop =new Antropologo("Juan",25,3400);
System.out.println(antrop.getNombre()+" , "+antrop.getEdad()+" Salario: ,"+antrop.getSalario());
//Trabajador trab =new Trabajador("José ", 23);
	}

}
