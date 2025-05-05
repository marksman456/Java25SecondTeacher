package lesson4.Notification;

public class EmailNotification extends Notification {

    public EmailNotification(String recipient) {
        super(recipient); // 呼叫父類別的建構子，設定通知接收者
    }

    @Override
    public void sendNotification() {
        System.out.println("已寄送通知"); // 發送電子郵件通知
    }

    public void log() {
        System.out.println("電子郵件通知已發送給: " + super.getRecipient()); // 記錄電子郵件通知的接收者
    }

}
