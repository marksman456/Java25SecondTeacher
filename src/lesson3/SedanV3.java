package lesson3;
public class SedanV3 extends Car2 {
    public SedanV3(String name, int maxSpeed) {
        super(name, maxSpeed); // 呼叫父類別的建構子，並傳入車名與最大速度
    }
   

    @Override

    public void wiper(String yes) {
        System.out.println(super.getName() + yes + "威力版本雨刷功能"); // 使用父類別的 getName() 方法取得車名
    }
    public void getMaxSpeed() {
        System.out.println(super.getName()+"加價會有更大馬力速度");
    }
}
