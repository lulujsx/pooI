//Music2.java 
// Herencia
class Nota {
  public int value;
  private Nota(int val) { value = val; }
  public static final Nota
    MEDIA = new Nota(0), 
    AGUDA  = new Nota(1),
    BAJA   = new Nota(2);
} 

class Instrumento {
    
    public void ejecuta(Nota n) {
    //System.out.println("Prueba "+ n.MEDIA.value); 
    System.out.println("Instrumento.ejecuta()");
  }
}



class Viento extends Instrumento {

// Redefine el metodo de la interface:
//  public void ejecuta(Nota n) {
//    System.out.println("Ejecuta flauta");
//  }
}

public class Music2 {
  public static void afinar(Viento i) {
    i.ejecuta(Nota.MEDIA);
  }
  public static void main(String[] args) {
    //Nota x; x=Nota.MEDIA;
   // System.out.println("Prueba "+ x.MEDIA.value); 
    System.out.println("Hay Herencia pero no redefinicion de ejecuta en clase Viento");
    Viento flauta = new Viento();
    afinar(flauta); 
  }
} 
