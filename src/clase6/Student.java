package clase6;

public class Student {
	
	private int rno;
	private String name;
	public Student(int r, String n) {
	rno = r;
	name = n;
	}
	@Override
	public String toString() {
	return rno + " " + name;
	}
	
	public class Demo {
		
		public static void main(String[] args) {
			Student s = new Student(101, "Susan Bones");
			System.out.println("Los atributos del Objeto s de la clase Student serán:");
			System.out.println(s);
			System.out.println("Valor entero: " + s.hashCode());
			System.out.println("Valor Hexadecimal: " +
			Integer.toHexString(s.hashCode()));
		}
	}

}
