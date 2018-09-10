package cl.cosmodev.spring.beans;


import org.springframework.stereotype.Component;
@Component
public class Ciudad {
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
