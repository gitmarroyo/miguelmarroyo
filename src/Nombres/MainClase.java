package Nombres;

public class MainClase {
	public static void main(String[] args) {
		Persona yo = new Persona("John Smith Marroyo", 27);
		@SuppressWarnings("unused")
		Persona tu = new Persona("Peter Smith Marroyo", 26);
		yo.mostrarDatos(); // 
		tu.mostrarDatos(); // 
	}
}