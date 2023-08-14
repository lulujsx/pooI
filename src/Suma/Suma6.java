package Suma;

//Caso 6
//Java orientado a objetos, settters y getters y uso Scanner

import java.util.Scanner;

public class Suma6 {
	
	private int numero1;
	private int numero2;
	
	public void setNumero1(int num1) {
		this.numero1 = num1;
	}
	
	public void setNumero2(int num2) {
		this.numero2 = num2;
	}
	
	public int getNumero1() {
		return this.numero1;
	}
	
	public int getNumero2() {
		return this.numero2;
	}
	
	int funcionSuma(int a,int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		Suma6 sumador = new Suma6();
		
		//instanciando un objeto scanner
		Scanner teclado = new Scanner(System.in);
		
		//numeros enteros
		System.out.println("Ingrese el primer numero: ");
		int a = teclado.nextInt();
		System.out.println("Numero ingresado: " + a);
		
		
		System.out.println("Ingrese el segundo numero: ");
		int b = teclado.nextInt();
		System.out.println("Numero ingresado: " + b);
		
		int resultado = sumador.funcionSuma(a, b);
		System.out.println("La suma de los numeros es: " + resultado);
		
		sumador.setNumero1(a);
		sumador.setNumero2(b);
		System.out.println("La suma de los numeros es: " + sumador.funcionSuma(sumador.getNumero1(), sumador.getNumero2()));
		teclado.close();
		
		
	}

}
