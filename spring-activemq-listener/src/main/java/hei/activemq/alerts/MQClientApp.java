package hei.activemq.alerts;

import hei.activemq.alerts.domain.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by heizhiqiang on 2015/12/31 0031.
 */
public class MQClientApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("messaging-context.xml");
        AlertService alertService = context.getBean(AlertService.class);
        Person person = alertService.retrieveMessageAlert();
        System.out.println(person.toString());
    }
}
