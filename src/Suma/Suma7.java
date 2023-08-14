package Suma;

//Caso 7
//Java orientado a objetos, settters y getters y uso Scanner y Constructor.

import java.util.Scanner;

public class Suma7 {
	
	private int numero1;
	private int numero2;
	
	//constructor default
	public Suma7(){
		
	}
	
	//constructor sobrecargado
	public Suma7(int num1,int num2) {
		this.numero1 = num1;
		this.numero2 = num2;
	}
	
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
	
	int funcionSuma(int x,int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
	
		//instanciando un objeto scanner
		Scanner teclado = new Scanner(System.in);
		
		System.out.println();
	}
	
}
