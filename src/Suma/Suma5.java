package Suma;

//Caso 5
//Java orientado a objetos, settters y getters

public class Suma5 {
	private int numero1;
	private int numero2;
	
	public void setNumero1(int a) {
		this.numero1 = a;
	}
	
	public void setNumero2(int b) {
		this.numero2 = b;
	}
	
	int getNumero1() {
		return this.numero1;
	}
	
	int getNumero2() {
		return this.numero2;
	}
	
	int funcionSuma(int y,int x) {
		int sum = y+x;
		return sum;
				
	}
	
	public static void main(String[] args) {
		
		Suma5 sumador = new Suma5();
		sumador.setNumero1(5);
		sumador.setNumero2(5);
		int a = sumador.getNumero1();
		int b = sumador.getNumero2();
		int resultado = sumador.funcionSuma(a, b);
		System.out.println("El resultado es: " + resultado);
		System.out.println("El resultado es: " + sumador.funcionSuma(sumador.numero1, sumador.getNumero2()));
		
	}
}
