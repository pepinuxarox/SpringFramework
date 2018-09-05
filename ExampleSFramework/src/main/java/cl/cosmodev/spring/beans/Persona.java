package cl.cosmodev.spring.beans;

public class Persona {
	private int id;
	private String nombre; 
	private String apodo;
	
	//injeccion de objetos
	private Pais pais;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	
	
	
	// Polimorfismo por el constructor al tener mas de una forma de instanciar esta clase
	
//	public Persona(int id, String nombre, String apodo) {
//		super();
//		this.id = id;
//		this.nombre = nombre;
//		this.apodo = apodo;
//	}
//	
//	public Persona(int id) {
//		super();
//		this.id = id;
//	}
//	
//
//	public Persona(String apodo) {
//		super();
//		this.apodo = apodo;
//	}
	

}
