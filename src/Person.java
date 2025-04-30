public class Person {
    public String name;
    public int age;

    //public static String schoolName="tt"


    public Person(String inputName, int age) {
        this.name = inputName;
        this.age = age;
    }

    public void showName() {
        System.out.println("Person.name:" + this.name);
    }

    public void showAge() {
        System.out.println("Person.age:" + this.age);
    }
}
