package Boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Beans.SpringConfiguration;
import Classes.Door;
import Classes.Light;

public class SpringPal {

	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Door bean=context.getBean(Door.class);
		bean.security();
	

}}
