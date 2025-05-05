package lesson4.Notification;

// 這個類別是用來定義通知的基本屬性和方法，任何實作這個類別的子類別都必須提供這些屬性和方法的具體實現
public abstract class Notification {

    private String recipient; // 通知接收者

    public Notification(String recipient) { // 建構子，接收通知接收者的名稱
        this.recipient = recipient; // 設定通知接收者
    }

    //abstact method
    // 抽象方法，這個方法沒有實作，子類別必須提供具體的實作
    public abstract void sendNotification(); // 發送通知的方法，子類別必須實作這個方法

    
    public String getRecipient() {
        return recipient;
    }

    public void log(){
        System.out.println("通知已發送給: " + this.getRecipient()); // 記錄通知發送的接收者
    }

   
}
