package Suma;

//Caso 4
//Java orientado a objetos, acceso a los atributos en main 

public class Suma4 {
	private int numero1 = 2;
	private int numero2 = 3;
	public int FuncionSuma() {
		return this.numero1 + this.numero2;
	}
	
	public static void main(String[] args) {
		Suma4 sumador = new Suma4();
		int resultado = sumador.FuncionSuma();
		System.out.println("La suma de los numeros es: " + resultado);
		System.out.println("El valor del primer numero es: " + sumador.numero1);
		System.out.println("El valor del segundo numero es: " + sumador.numero2);
	
	}
	
}
