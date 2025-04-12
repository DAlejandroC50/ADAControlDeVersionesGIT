package ejerciciosADAGitRemoto2025;

public class ClaseObjeto {
	public ClaseObjeto siguiente;
	public ClaseObjeto anterior;
	
	private String nombre;
	private String peso;
	private String color;
	
	private int numero;
	
	//Constructor de la clase
	public ClaseObjeto (String name, String weight, String col) {
		nombre=name;
		peso=weight;
		color=col;
	}

	//Métodos para las variables
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String name) {
		nombre = name;
	}
	
	public String getPeso() {
		return peso;
	}
	public void setPeso(String weight) {
		peso = weight;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String col) {
		color = col;
	}
	
	//Método para obtener el número de los elementos en la lista
	public int getNumero() {
		return numero;
	}
	
}
