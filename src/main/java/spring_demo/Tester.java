package spring_demo;

import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
   public static void main(String[] args) {
	  // Mobile mobile1=new Mobile();
	   //System.out.println(mobile1);
	   
	   
	   
	
	
	ApplicationContext context=new ClassPathXmlApplicationContext("myconfiguration.xml");
	
	System.out.println(context.getBean("mobile"));
	System.out.println(context.getBean("mobile"));
	System.out.println(context.getBean("mobile"));
	
	
	System.out.println(context.getBean("laptop"));
	System.out.println(context.getBean("laptop"));
	System.out.println(context.getBean("laptop"));
}
}
