// Music2_3.java 
// Inheritance, Overwriting, Polymorphism, Upcasting anulado y agregamos más clases
// VientoMadera y VientoMetal.


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
class VientoMadera extends Viento {
  public void ejecuta(Nota n) {
    System.out.println("Ejecuta clarinete (VientoMadera.ejecuta())");
  }
}

class VientoMetal extends Viento {
  public void ejecuta(Nota n) {
    System.out.println("Ejecuta trompeta (VientoMetal.ejecuta())");
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

class Music2_3 {

// Este metodo "afinar(Instrumento i)" reemplaza a los tres que siguen
// afinar(Viento i)  afinar(Cuerda i)  afinar(Percusion i) y que 
// aparecen comentados entre /* */ .
// Aquí se ve la potencia del del "POLIMORFISMO" que anula el UPCASTING

     public static void afinar(Instrumento i) {
    i.ejecuta(Nota.MEDIA);
  }


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
    VientoMadera clarinete = new VientoMadera();
    VientoMetal trompeta = new VientoMetal();
    
    System.out.println("En este ejemplo hay Herencia, Sobreescritura, Upcasting anulado y Polimorfismo con");
    System.out.println("el agregado de más clases");

    afinar(flauta); 
    afinar(guitarra);
    afinar(bombo);
    afinar(clarinete);
    afinar(trompeta);
  }
} 