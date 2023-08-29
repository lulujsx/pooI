package Music;

//Herencia y Redefinición o Sobreescritura(Overwriting)
class Nota {
	private int value;
	private Nota(int val){
		value = val;
	}
	  
public static final Nota
	MEDIA = new Nota(0), 
	AGUDA  = new Nota(1),
	BAJA   = new Nota(2);  
} 

class Instrumento {
	public void ejecuta(Nota n) {
	System.out.println("Instrumento.ejecuta()");
 }
}

class Viento extends Instrumento {
//Redefine o sobreescribe el método ejecuta(Nota n) de la Superclase
	public void ejecuta(Nota n) {
		System.out.println("Ejecuta flauta");
	}
}

public class Music1 {
	
	public static void afinar(Viento i) {
	     i.ejecuta(Nota.MEDIA);
	  }
	
	public static void main(String[] args) {
	 //En este ejemplo hay Herencia y Redefinición(Overwriting)
	// no hay Upcasting

	    Viento flauta = new Viento();

	 // En la siguiente instrucción el objeto flauta ejecutará la
	//  primera vez por medio del mensaje enviado al objeto 

	    flauta.ejecuta(Nota.MEDIA); //mensaje enviado al objeto

	//  En la siguiente instrucción el objeto flauta ejecutará 
	//  por segunda vez por medio del método static afinar.

	    afinar(flauta); 
	    
	  }
}
