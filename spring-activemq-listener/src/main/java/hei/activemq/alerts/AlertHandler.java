package hei.activemq.alerts;

import hei.activemq.alerts.domain.Person;

/**
 * Created by heizhiqiang on 2015/12/31 0031.
 */
public class AlertHandler {
    public void handleMessageAlert(Person model) {

        System.out.println("Message received =" + model.toString());
    }

}
