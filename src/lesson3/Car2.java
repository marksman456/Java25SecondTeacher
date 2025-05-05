package lesson3;

public class Car2 {

   // 這是一個基礎車輛類別（Car2），可供其他車種（子類別）繼承，讓它們共用車輛的屬性與方法，達到程式碼重用與維護簡化的目的
   private String name; // 車名 預設為空字串

   private int maxSpeed; // 最大速度 預設為100

   public Car2(String name,int maxSpeed) {
         this.setMaxSpeed(maxSpeed); // 使用 setter 方法設置最大速度，可擴充驗證邏輯 例如限制最大值 or 不能為0
         this.setName(name); // 使用 setter 方法設置車名
    }


   public void setMaxSpeed(int maxSpeed) {
       this.maxSpeed = maxSpeed;
   }

   public void getMaxSpeed() {
       System.out.println("最大速度是:" +this.maxSpeed);
   }

   public void setName(String name) {
       this.name = name;
   }
   public String getName() {
       return name;
   }


}