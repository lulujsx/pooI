// Music2_2.java 
// Inheritance, Overwriting, Polymorphism, Upcasting (Herencia,Sobreescritura,Polimorfismo,Upcasting)

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

public class Music2_2 {

// Este metodo "afinar(Instrumento i)" reemplaza a los tres que siguen
// afinar(Viento i)  afinar(Cuerda i)  afinar(Percusion i) y que 
// aparecen comentados entre /* */ .
// Aquí se ve la potencia del"POLIMORFISMO" , que además anula el UPCASTING

    public static void afinar(Instrumento i) //UPCASTING anulado por el POLIMORFISMO
  {
      i.ejecuta(Nota.MEDIA);
  }

// Abajo de esta línea se ven los 3 afinar reemplazados

/*  public static void afinar(Viento i) {
    i.ejecuta(Nota.MEDIA);
  }
  public static void afinar(Cuerda i) {
    i.ejecuta(Nota.MEDIA);
  }
  public static void afinar(Percusion i) {
    i.ejecuta(Nota.MEDIA);                 
  }                                        */

  public static void main(String[] args) {
    Viento flauta = new Viento();
    Cuerda guitarra = new Cuerda();
    Percusion bombo = new Percusion();
    System.out.println("En esta prueba hay Herencia, Sobreescritura, Upcasting anulado y Polimorfismo");  
    afinar(flauta);   //  en afinar UPCASTING será anulado por el POLIMORFISMO
    afinar(guitarra); //  en afinar UPCASTING será anulado por el POLIMORFISMO
    afinar(bombo);    //  en afinar UPCASTING será anulado por el POLIMORFISMO
  }
} 