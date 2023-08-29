// Music2_1.java 
// Overloading en lugar de  upcasting.

class Nota {
  private int value;
  private Nota(int val) { value = val; }
  public static final Nota
    MEDIA = new Nota(0), 
    AGUDA = new Nota(1),
    BAJA = new Nota(2);
} 

class Instrumento {
  public void ejecuta(Nota n) {
    System.out.println("Instrumento.ejecuta()");
  }
}

class Viento extends Instrumento {
  public void ejecuta(Nota n) {
    System.out.println("Ejecuta flauta (Viento.ejecuta())");
  }
}

class Cuerda extends Instrumento {
  public void ejecuta(Nota n) {
    System.out.println("Ejecuta guitarra (Cuerda.ejecuta())");
  }
}

class Percusion extends Instrumento {
  public void ejecuta(Nota n) {
    System.out.println("Ejecuta bombo (Percusion.ejecuta())");
  }
}

// Vemos el overloading de afinar para cada objeto de clase distinta

public class Music2_1 {
  public static void afinar(Viento i) {
    i.ejecuta(Nota.MEDIA);
  }
  public static void afinar(Cuerda i) {
    i.ejecuta(Nota.MEDIA);
  }
  public static void afinar(Percusion i) {
    i.ejecuta(Nota.MEDIA);
  }
  public static void main(String[] args) {
    Viento flauta = new Viento();
    Cuerda guitarra = new Cuerda();
    Percusion bombo = new Percusion();
    System.out.println("En esta prueba hay Herencia y Overloading(Sobrecarga de método afinar)");
    afinar(flauta);   // No upcasting
    afinar(guitarra); // No upcasting
    afinar(bombo);    // No upcasting
  }
} 