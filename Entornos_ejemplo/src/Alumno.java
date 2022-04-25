
public class Alumno {
// atributos 
	private String nombre;
	private String apellido;
	private int DNI;
	
// contructor con parametros 
	public Alumno(String n, String a, int dni) {
		this.nombre=n;
		this.apellido=a;
		this.DNI=dni;
	}
	// añado metodo to String 
	public String toString() {
		return "alumno->Nombre : "+nombre+ "Apellido : "+apellido+ "DNI:" +DNI;
	}
}
