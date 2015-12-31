package hei.activemq.alerts;

import hei.activemq.alerts.domain.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by heizhiqiang on 2015/12/31 0031.
 */
public class PersonJmsMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("messaging-context.xml");
        AlertService alertService = context.getBean(AlertService.class);

        Person person = new Person("123456","tom","159678678","jelei");
        int star = 0;
        for(int i=0; i< 10; i++) {
            star += 1;
            person.setStar(star);
            alertService.sendMessageAlert(person);
        }

        context.close();
    }
}
