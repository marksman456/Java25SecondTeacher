package lesson1;
public class Family {
    public String who;
    public String name;
    public int age;

//把參數帶入這個class的屬性
    // 建構子(初始化)

    public Family(String who,String name, int age){
        this.who=who;
        this.name=name;
        this.age=age;
    }
    public void showFamilyInfo(){
        System.out.println("家庭成員: " + this.who + " 姓名: " + this.name + " 年齡: " + this.age);
    }

}
//如果再同一個檔案再創一個物件 這個物件只能在同檔案使用 如要跨檔必須再建立一個屬於他的檔名檔案
class Family2 {
    public String who;
    public String name;
    public int age;


    public void showFamilyInfo(){
        System.out.println("家庭成員: " + this.who + " 姓名: " + this.name + " 年齡: " + this.age);
    }
}




