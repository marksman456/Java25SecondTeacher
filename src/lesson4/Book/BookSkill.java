package lesson4.Book;


// 這個介面定義了書籍的基本屬性和方法，任何實作這個介面的類別都必須提供這些屬性和方法的具體實現
//技能組的概念
//一個腳色用有很多個技能 其他子類別是用這個技能組來實作
//介紹的技能包
public interface BookSkill {

    public void setTitle(); // 取得書名
    public void setAuthor(); // 取得作者
    public void setPrice(); // 取得價格
} 
    

