package Nombres;

public class MainClase {
	public static void main(String[] args) {
		Persona yo = new Persona("John Smith Marroyo", 25);
		@SuppressWarnings("unused")
		Persona tu = new Persona("Peter Smith Marroyo", 25);
		yo.mostrarDatos(); // yo.edad = 25; da error
	}
}