package cl.cosmodev.spring.ExampleSFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.cosmodev.spring.beans.Persona;

public class App {
	public static void main(String[] args) {
//    	Primera forma de hacerlo, mediante el XML
//    	ApplicationContext appContext= new ClassPathXmlApplicationContext("cl/cosmodev/spring/xml/beans.xml");    	
//      Hacer lo mismo mediante injeccion de anotaciones
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);

//   	otra forma de hacerlo
//    	AnnotationConfigApplicationContext appContext2= new AnnotationConfigApplicationContext();
//  	appContext2.register(AppConfig.class);
//    	appContext2.register(AppConfig2.class);

//		Animal a = (Animal) appContext.getBean("animal");
//		System.out.println(a.getNombre());
//
//		((ConfigurableApplicationContext) appContext).close();
//		
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("cl/cosmodev/spring/xml/beans.xml"); 
			Persona p= (Persona)appContext.getBean("persona");
			
			System.out.println(p.getId()+"-"+p.getNombre()+"-"+p.getApodo()+"-"+p.getPais().getNombre()+"-"+p.getPais().getCiudad().getNombre()
					);
	}
}
