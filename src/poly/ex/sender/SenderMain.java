package poly.ex.sender;

public class SenderMain {
    public static void main(String[] args) {
        Sender[] seders = {new EmailSender(), new SmsSender(), new FacebookSender()};

        for (Sender sender : seders) {
            sender.sendMessage("환영합니다!");

        }
    }
}
