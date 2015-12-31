package hei.activemq.alerts;

import hei.activemq.alerts.domain.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsOperations;

public class JMSMain {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("messaging-context.xml");
    JmsOperations jms = context.getBean(JmsOperations.class);
    Person person = new Person("123456","tom","159678678","jelei");
    int star = 0;
    for(int i=0; i< 10; i++) {
      star += 1;
      person.setStar(star);
      jms.convertAndSend("person.alert.queue", person);
    }
    context.close();
  }

}
