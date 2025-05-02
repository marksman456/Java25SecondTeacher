package lesson2;

public class dog extends Animal2 {
    // 這裡是繼承父類別的屬性
    public dog(){
        super(); // 呼叫父類別的建構子
        // 如果不寫這行，會自動呼叫父類別的建構子
        //只要是繼承父類別的子類別，建構子裡面都會呼叫父類別的建構子

        //要寫super()這行，必須放在第一行，否則會報錯
        //會要寫這行 有可能之後會有父類別的建構子需要傳入參數

        System.out.println("狗的建構子");
    }

    // 這裡是子類別的方法 父類別不能使用
    public void bark(){
        System.out.println("汪汪叫");
    }

    @Override
    public void speak(){
        System.out.println("狗再汪汪叫");
    }
}
