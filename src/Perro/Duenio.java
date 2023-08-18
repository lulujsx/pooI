package Perro;

public class Duenio {
	
	private String nombre;
	private int dni;
	
	public Duenio(String name){
		this.nombre = name;
	}
	
//	public void setNombre(String nombre1) {
//		this.nombre = nombre1;
//	}
//
//	public String getNombre() {
//		return this.nombre;
//	}

	public void ordenaLadrar(Perro perrix) {
		System.out.println("*" + this.nombre + " le ordena ladrar a su perro*");
		perrix.ladrar();
	}
}
