package lesson3;

public class SedanV2 extends Car2 {
    public SedanV2 (String name,int maxSpeed) {
        super(name,maxSpeed); // 呼叫父類別的建構子，並傳入車名與最大速度
     
        // 呼叫父類別的建構子
         // 如果父類別沒有定義任何建構子，Java 會自動加入無參建構子，所以這行可以省略
        // 如果父類別定義了有參數的建構子，必須手動呼叫其中一個建構子（用 super(...)），否則會編譯錯誤
        // 如果父類別有定義無參建構子，Java 會自動呼叫它，所以可以省略 super()
        // 如果父類別有多載建構子，且其中有無參建構子，Java 會自動呼叫它（前提是子類別沒寫 super(...)）
    }

    public void light(){
        String getCarName = super.getName(); // // 使用 super 呼叫父類別的方法 getName()，取得車名

        System.out.println(getCarName+"新功能:開燈");
    }
}
