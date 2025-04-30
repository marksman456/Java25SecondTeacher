package lesson1;
import lesson1.homework.traning.Employee;
public class DemoClass {
    public static void main(String[] args) {

        // 類別實作
        // Car car1 = new Car("123", "blue", 2012);

        // car1.showCarInfo();

        // Car car2 = new Car("456", "red", 2015);

        // car2.showCarInfo();

        // 實作2

        // Person Person1 = new Person("Alice", 6);

        // Person Person2 = new Person("Dan", 12);
        // Person1.showName();

        // Person1.showAge();

        // Person2.showName();

        // Person2.showAge();

        // System.out.println(Person.schoolName);

        // 不用再class裡 new一個建構子帶入this.name this.count 直接在程式進入點裡 賦予值

        // Animal animal1=new Animal();

        // animal1.name="123";
        // animal1.count=112;
        // animal1.showCount();
        // animal1.showName();

        // Cloth cloth1=new Cloth();

        // cloth1.color="red";
        // cloth1.size="L";

        // cloth1.showColor();
        // cloth1.showSize();

        // Cloth cloth2=new Cloth();

        // cloth2.color="blue";
        // cloth2.size="XL";

        // cloth2.showColor();
        // cloth2.showSize();

        // Cloth C1 = new Cloth("12", "RED", "M");
        // C1.showClothInfo();

        // 在class裡先建構子帶入this.name this.count 在程式進入點裡 導入物件再賦予物件參數裡值,做使用
        // Family fmaily1=new Family("dad","Hank",40);
        // Family fmaily2=new Family("mom","Alice",41);
        // fmaily1.showFamilyInfo();
        // fmaily2.showFamilyInfo();



        // Bank bank1=new Bank("123",3000);
        // bank1.showBalance();

        // //更改帳號
        // bank1.setAccount("123","456");
        // String account=bank1.getAccount();
        // System.out.println("帳號:" + account);

        // //action提款
        // bank1.setBalance("123","withdraw",3000);
        // int balance=bank1.getBalance();

        // System.out.println("您的餘額:" + balance);

        // //action存款
        // bank1.setBalance("123","deposit",1000);
        // int b2=bank1.getBalance();

        // System.out.println("您的餘額:" + b2);


        // School school1 = new School("01", "23號");
        // school1.showSchoolInfo();

        // school1.setName("456");
        // String name = school1.getName();
        // System.out.println("學校名稱:" + name);

        // school1.setAddress("24號");
        // String address = school1.getAddress();
        // System.out.println("學校地址:" + address);


    //     student stu1=new student();
         

    //     stu1.setName("Dan");
    //    String name1=stu1.getName();
    //    System.out.println("學生姓名:"+name1);
       
    //    stu1.setScore(100);
    //    int score1=stu1.getScore();
    //    System.out.println("學生成績:"+score1);
    // }

    
Employee employee1= new Employee("susan");


String e1 =employee1.getName();
System.out.println("員工姓名:" + e1);
}
}
