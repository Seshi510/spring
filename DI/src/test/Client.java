package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client {
	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("resources/spconfig.xml");
        Test t = (Test)app.getBean("t");
        t.hello("Seshi");
	}

}
