package samuelesimeone.EsercizioD1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import samuelesimeone.EsercizioD1.entities.Menu;


import java.util.ArrayList;

@SpringBootApplication
public class EsercizioD1Application {

	public static void main(String[] args) {

		SpringApplication.run(EsercizioD1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EsercizioD1Application.class);

		Menu m = (Menu) ctx.getBean("menu");
		m.print();
	}

}
