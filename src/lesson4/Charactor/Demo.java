package lesson4.Charactor;

// 抽象 介面 練習
public class Demo {
    public static void main(String[] args) {
        
        Dragon Jack=new Dragon();

        Jack.fly();
        Jack.land();

        Jack.attack();
        Jack.defend();

        Jack.heal();

       NPC npc=new NPC();
        npc.heal();

        // 這裡可以添加更多的測試代碼來驗證其他功能

  
}
}