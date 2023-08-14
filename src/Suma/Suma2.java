package Suma;

//Caso 2
//Java no orientado a objetos usando funciones o métodos

public class Suma2 {
	
	static int FuncionSuma(int numero1,int numero2) {
		return numero1 + numero2;
	}
	
	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		int suma = FuncionSuma(a,b);
		System.out.println("La suma de loso numeros es: " + suma);
	}

}
