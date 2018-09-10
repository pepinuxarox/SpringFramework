package cl.cosmodev.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan(basePackages = "cl.cosmodev.spring")
//Anotación encargada de definir que la clase es una clase de configuración para el framework
public class AppConfig {
	 
//	@Bean
//	Anotación que marca como bean cada uno de los métodos de tal forma que esten disponibles para Spring
	
//
	@Bean	
	public Persona persona() {
		return new Persona();
		
	}
	@Bean	
	public Pais pais() {
		return new Pais();
		
	}

	
}
