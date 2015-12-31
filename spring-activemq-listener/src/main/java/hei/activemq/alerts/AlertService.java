package hei.activemq.alerts;

import hei.activemq.alerts.domain.Person;

/**
 * Created by heizhiqiang on 2015/12/31 0031.
 */
public interface  AlertService {
    void sendMessageAlert(Person person);

     Person retrieveMessageAlert();
}
