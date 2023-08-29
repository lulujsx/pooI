package clase6;

/**Cuando el especificador de acceso de una clase
Base es public, todos
los miembros públicos de la clase Base se
convertirán en miembros
públicos de la clase Derivada.También los
miembros protected de la
clase Base, que estudiaremos en el siguiente
ejemplo,lo serán también
en la clase Derivada. En cualquier caso, los
miembros private de la
clase Base lo seguirán siendo(private) y no
estarán accesibles para los miembros de la clase
Derivada.
*/

public class Base {
	private int i;
	private int j;
	
	public Base(){
		System.out.println("Ejecucion Constructor Base");
	}
	
	void set(int a, int b){
		this.i=a;
		this.j=b;
	}
	
	void show(){

		System.out.println("i= " + this.i + " j= " + this.j);
	}
	
	}
	class Derivada extends Base {
	private int k;
	public Derivada(int x){
		System.out.println("Ejecucion Constructor Derivada");
		this.k = x;
		//this.i=55;
		//System.out.println("i: " + this.i + " k: "+ this.k);
	}
	void showk(){
		System.out.println("k= " + this.k);
	}
	
		public static void main(String[] args){
			System.out.println();
			Derivada ob= new Derivada(3);
			ob.set(1,2);
			System.out.println("Los atributos i y j heredados de clase Base");
			ob.show();
			System.out.println("El atributo k propio de clase Derivada");
			ob.showk();
	}
}
