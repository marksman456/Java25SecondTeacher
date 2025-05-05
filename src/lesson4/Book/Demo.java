package lesson4.Book;

public class Demo {

    public static void main(String[] args) {

        Bookinfo book1 = new Bookinfo(); // 建立 Book1 物件，這個物件實作了 Book1 介面 
        book1.setPrice(); // 呼叫 Book1 物件的方法，這些方法是從 Book 介面繼承來的
        book1.setTitle(); // 呼叫 Book1 物件的方法，這些方法是從 Book 介面繼承來的
        book1.chapter(); // 呼叫 Book1 物件的方法，這些方法是從 Book2 介面繼承來的
    }
}
