package poly.ex.sender;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String Message) {
        System.out.println("SNS을 발송합니다 : " + Message);
    }
}
