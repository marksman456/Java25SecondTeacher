package lesson4.Book;

//一定要引用到book介面的所有方法來實作
public class Bookinfo implements BookSkill ,BookSkill2{

    @Override
    public void setTitle() {
        System.out.println("01"); // 實作書名的方法
    }
        public void setAuthor() {   // 實作作者的方法

            System.out.println("123");
    }
    public void setPrice() {
        System.out.println(500); // 實作價錢的方法
    }

    @Override
    public void chapter() {
        System.out.println("第1章節"); // 實作頁數的方法
    }
}
