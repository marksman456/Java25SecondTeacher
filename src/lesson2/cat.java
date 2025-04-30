package lesson2;

public class  cat extends Animal {
    public void mia(){
        System.out.println("喵喵叫");
    }

    //這裡是覆寫父類別的方法 讓這個方法可以變成自己想要的樣子
   
@Override
    public void speak(){
        System.out.println("貓再喵喵叫");
    }
}
