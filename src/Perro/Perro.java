package Perro;

public class Perro {
	
	private String nombre;
	
	public Perro(String nomb) {
		this.nombre = nomb;
	}
	
	public void ladrar() {
		System.out.println(this.nombre + ": woof woof");
	}
	
	public void setNombre(String nomb1) {
		this.nombre = nomb1;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public static void main(String[] args) {
		Perro perrito1 = new Perro("Spike");
		Duenio duenio1 = new Duenio("Juan");
		duenio1.ordenaLadrar(perrito1);
	}
	

}
