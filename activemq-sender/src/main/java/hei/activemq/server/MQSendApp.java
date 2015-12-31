package hei.activemq.server;

/**
 * Created by heizhiqiang on 2015/12/31 0031.
 */
public class MQSendApp {

    public static void main(String[] args) {
        MQSender sender = new MQSender("tcp://localhost:61616", "admin", "admin");
        try {
            while (true) {
                sender.sendMessage("test.queue", "hello world ...");
                Thread.sleep(1000);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

    }
}
