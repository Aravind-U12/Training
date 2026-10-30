public class Main {

    public static void main(String[] args) {

        MessageService email = new EmailService();

        NotificationService emailNotification =
                new NotificationService(email);

        emailNotification.notifyUser("Welcome to Java!");

        MessageService sms = new SMSService();

        NotificationService smsNotification =
                new NotificationService(sms);

        smsNotification.notifyUser("Your OTP is 123456");
    }
}