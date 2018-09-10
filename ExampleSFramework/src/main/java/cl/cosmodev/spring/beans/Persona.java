package cl.cosmodev.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Persona implements InitializingBean, DisposableBean {
	private int id;
	private String nombre;
	private String apodo;

	// puede ser usado en el atributo o en los metodos de acceso
	// byType es por defecto, si se hace a una interfaz dará error porq no sabe a
	// cual escoger.
	@Autowired
	// permite definir a que id se va a asociar el bean en caso de existir mas de
	// uno de ese tipo.
//	@Qualifier("nombre del XML")
	private Pais pais;

	@Override
	public String toString() {
		return id + "," + nombre + "," + apodo + "," + pais.getNombre();
	}

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

	@Required
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Persona() {
		super();
	}

	// por interfaz
	public void afterPropertiesSet() throws Exception {
		System.out.println("Antes de iniciar el bean");
	}

	public void destroy() throws Exception {
		System.out.println("Bean a punto de ser destruido");

	}

}
