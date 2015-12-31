package hei.activemq.server;

/**
 * Created by heizhiqiang on 2015/12/31 0031.
 */
public class MQClientApp {

    public static void main(String[] args) {
        MQListener  sender = new MQListener("tcp://localhost:61616", "admin", "admin");
        try {
            sender.startReceiving("test.queue");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
