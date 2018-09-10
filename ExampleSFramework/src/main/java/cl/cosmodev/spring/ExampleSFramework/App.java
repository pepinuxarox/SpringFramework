package cl.cosmodev.spring.ExampleSFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cl.cosmodev.spring.beans.AppConfig;
import cl.cosmodev.spring.beans.Pais;
import cl.cosmodev.spring.beans.Persona;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
			
		
			Persona p= appContext.getBean(Persona.class);
//			Pais pais= appContext.getBean(Pais.class);
			
			p.setId(1);
			p.setApodo("pepi");
//			p.setPais(pais);

			System.out.println(p);
			((ConfigurableApplicationContext)appContext).close();
	}
}
