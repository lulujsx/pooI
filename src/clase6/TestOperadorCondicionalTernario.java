package clase6;

public class TestOperadorCondicionalTernario {

	/*
	 * Un operador ternario es un operador el cual tiene tres operandos o
	 * argumentos. Usando este operador podemos pasar de tener varias líneas de
	 * código a tener una sola. En la mayoría de lenguajes de programación, es el
	 * único que existe como operador ternario.
	 */

	public static void main(String[] args) {
		// Busquemos el mayor de dos numeros enteros.
		int numeroA = 12;
		int numeroB = 8;
		int mayor = 0;
		int mayorTernario = 0;

		// Sin operador condicional ternario quedaria asi:
		if (numeroA > numeroB)
			mayor = numeroA;
		else
			mayor = numeroB;
		System.out.println("El numero mayor sin usar operador condicional ternario es: " + mayor);
		
		// Con operador condicional ternario quedaria asi:
		mayorTernario = (numeroA > numeroB) ? numeroA : numeroB;
		System.out.println("El numero mayor usando operador condicional ternario es: " + mayorTernario);

	}
}
