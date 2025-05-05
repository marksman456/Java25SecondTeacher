package lesson3.People;

public class Person {
    private String name; // 姓名
    private int age; // 年齡

    public Person(String inputName, int age) {
        this.setName(inputName); // 使用 setter 方法設置姓名
        this.setAge(age); // 使用 setter 方法設置年齡
    }

    public String getName() {
        return this.name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int inputAge) {
        if(inputAge >= 0) {
            this.age = inputAge;
        }
        else{
            System.out.println("年齡不能小於0");
        }
        
    }

    public void introduce() {
        System.out.println("Hello, my name is " + this.getName() + " and I am " + this.getAge() + " years old.");
    }
   
    
}
