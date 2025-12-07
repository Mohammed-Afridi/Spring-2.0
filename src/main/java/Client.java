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
        //Resource r = new ClassPathResource("spring.xml");
        //BeanFactory factory = new XmlBeanFactory(r);

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Object o = context.getBean("t");
        Object o1 = context.getBean("t");
        Object o2 = context.getBean("t");

        System.out.println(o==o1);
        System.out.println(o2==o1);

        Test t = (Test) o;

        t.hello();
    }
}
