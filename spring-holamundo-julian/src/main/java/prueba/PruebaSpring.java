package prueba;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.BeanSpring;
import beans.Taller;

public class PruebaSpring {

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanFactory factory = context;
		BeanSpring miBean = (BeanSpring) factory.getBean("miBean");
		Taller miBean2 = (Taller) factory.getBean("miBean2");
		System.out.println("Mensaje: " + miBean.getMensaje());
		System.out.println("Mensaje: " + miBean2.getMensaje());
	}

}
