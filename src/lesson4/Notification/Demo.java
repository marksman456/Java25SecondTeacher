package lesson4.Notification;

public class Demo {
    public static void main(String[] args) {

        //抽象不允許new父類別物件
        // Notification notification = new Notification("John"); // 這行會報錯，因為 Notification 是抽象類別，不能直接實例化
        //只有子類別有實作才能new
        
        Notification emailNotification = new EmailNotification("John");

        emailNotification.sendNotification(); // 發送電子郵件通知
        emailNotification.log(); // 記錄通知發送的接收者
    }
}
