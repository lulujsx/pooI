package Suma;

//Caso 3
//Java orientado a objetos 

public class Suma3 {
	
	int numero1 = 5;
	int numero2 = 5;
	int FuncionSuma() {
		return this.numero1 + this.numero2;
	}
	
	public static void main(String[] args) {
		Suma3 sumador = new Suma3();
		int suma = sumador.FuncionSuma();
		System.out.println("La suma de los numeros es: " + suma);
	}
	

}
