package lesson1;

//類別
public class Car {
    // 以下宣告的全域變數(globe)可以給這個類別的所有方法使用
    // 這裡是類別的屬性
    public String color;
    public String number;
    public int year = 0;

    // 建構子(初始化)(跟類別同名稱的方法)
    // 初始化類別的屬性
    // 這裡是類別的建構子
    // 沒this的變數是區域變數(local variable)只能在這個方法使用
    public Car(String inputNumber, String inputColor, int inputYear) {
        this.number = inputNumber;
        this.color = inputColor;
        this.year = inputYear;

        
        //可以不用this的情況只有區域變數跟全域變數的命名不同
    //    number = inputNumber;
    //     color = inputColor;
    //     year = inputYear;

    }

    // 方法
    public void showCarInfo() {
        System.out.println("Car number:" + this.number + "Car color:" + this.color + "Car year:" +
                this.year);
    }

}
