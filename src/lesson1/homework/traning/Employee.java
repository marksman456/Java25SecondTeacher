package lesson1.homework.traning;

public class Employee {

    private String name;

    // 寫了建構子 導向set函式
    public Employee(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
