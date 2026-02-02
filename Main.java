interface MessageSender {
    void send(String message);
}

class EmailService implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Email send: " + message);
    }
}

class SmsService implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("SMS send: " + message);
    }
}

class NotificationService {
    private MessageSender sender;

    NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    void notify(String message) {
        sender.send(message);
    }
}

public class Main {
    public static void main(String[] args) {

        MessageSender emailSender = new EmailService();
        NotificationService emailNotification = new NotificationService(emailSender);
        emailNotification.notify("Hello Email");

        MessageSender smsSender = new SmsService();
        NotificationService smsNotification = new NotificationService(smsSender);
        smsNotification.notify("Hello SMS");
    }
}