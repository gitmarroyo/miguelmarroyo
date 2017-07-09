package Nombres;
public class Persona {
	private String nombre;
	private int edad;

	public Persona(String str, int n) {
		nombre = str;
		edad = n;
	}

	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre + "\nEdad: " + edad);
	}
}