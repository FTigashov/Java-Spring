package mvc_patient_and_hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Выполнение задания
public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Assistant assistant = context.getBean("assistant", Assistant.class);
        assistant.getMedicalCard();
        assistant.getSchedule();
        assistant.sendToDoctor();
    }
}
