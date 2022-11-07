package example_photograph_with_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    // Использование Spring на примере
    ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    Camera camera = context.getBean("camera", Camera.class);

}
