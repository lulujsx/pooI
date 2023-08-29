package clase6;
import java.util.ArrayList;

/* ejemplo de como declaramos una referencia a ArrayList
 * metodo add(), class contenedora, recorrido secuencial de una coleccion
 */

public class ArrayListTestEmpleado {
	public static void main(String[] args)
	   {
	      // fill the staff array list with three Empleado objects
		  ArrayList<Empleado> staff = new ArrayList<Empleado>();

	      staff.add(new Empleado("Carl Cracker", 75000, 1987, 12, 15));
	      staff.add(new Empleado("Harry Hacker", 50000, 1989, 10, 1 ));
	      staff.add(new Empleado("Tony Tester" , 40000, 1990, 3 , 15));

	      // aumentar el salario de todos en un 5%
	      for (Empleado e : staff)
	         e.raiseSalario(5);

	      // print out information about all Empleado objects
	      for (Empleado e : staff)
	         System.out.println("nombre=" + e.getNombre() + ",salario=" + e.getSalario() + ",fecha de alta=" 
	            + e.getFecha_alta());
	   }
}
