package hei.activemq.alerts;

import hei.activemq.alerts.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by heizhiqiang on 2015/12/31 0031.
 */
public class AlertServiceImpl implements AlertService {

    @Autowired
    private JmsOperations jmsOperations;

    @Autowired
    public AlertServiceImpl(JmsOperations jmsOperations) {
        this.jmsOperations = jmsOperations;
    }

    /*@Override
    public void sendMessageAlert(final Person person) {
        System.out.println("Send message = "+person.toString());
        jmsOperations.send(
                "person.alert.queue",
                new MessageCreator() {
                    public Message createMessage(Session session)
                            throws JMSException {
                        return session.createObjectMessage(person);
                    }
                }
        );
    }*/

    @Override
    public void sendMessageAlert(Person person) {
        jmsOperations.convertAndSend(person);
    }

    @Override
    public Person retrieveMessageAlert() {
        return (Person) jmsOperations.receiveAndConvert();
    }
}
