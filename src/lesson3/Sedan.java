package lesson3;

public class Sedan extends Car2{

     // 建構子：建立 Sedan 物件時，要傳入車名 和 最大速度 之後傳入super也就是父類別的建構子
    public Sedan(String name,int maxSpeed) {
        super(name,maxSpeed); // 呼叫父類別的建構子，並傳入車名與最大速度最一開始的建構子
        // 這行是呼叫父類別的建構子，並傳入車名與最大速度，這樣 Sedan 物件就會有這些屬性
     
        // 呼叫父類別的建構子
         // 如果父類別沒有定義任何建構子，Java 會自動加入無參建構子，所以這行可以省略
        // 如果父類別定義了有參數的建構子，必須手動呼叫其中一個建構子（用 super(...)），否則會編譯錯誤
        // 如果父類別有定義無參建構子，Java 會自動呼叫它，所以可以省略 super()
        // 如果父類別有多載建構子，且其中有無參建構子，Java 會自動呼叫它（前提是子類別沒寫 super(...)）
    }

    public void back(){
       String name = super.getName(); // // 使用 super 呼叫父類別的方法 getName()，取得車名
        System.out.println(name+"新功能:後退");
        
    }

    
    }
    

