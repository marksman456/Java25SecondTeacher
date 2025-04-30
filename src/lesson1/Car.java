package lesson1;
//類別
public class Car {
    // 屬性
    public String color;
    public String number;
    public int year = 0;

    // 建構子(初始化)
    public Car(String inputNumber,String inputColor,int inputYear){
        this.number=inputNumber;
        this.color=inputColor;
        this.year=inputYear;
    }

    // 方法
    public void showCarInfo() {
        System.out.println("Car number:" + this.number + "Car color:" + this.color+"Car year:"+
        this.year);
    }

}



