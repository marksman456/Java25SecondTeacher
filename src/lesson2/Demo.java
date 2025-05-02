package lesson2;

public class Demo {
    public static void main(String[] args) {
        Animal2 animal = new Animal2();
        animal.speak();

        // animal.bark(); 
        // 這行會報錯，因為animal是Animal類別的物件，不能使用dog類別的方法 間單來說父類別不能使用子類別的方法
       

        dog dog1 = new dog();
        dog1.speak();
        
        // dog1.bark();

        cat cat1=new cat();
        cat1.speak();
        // cat1.mia();
        


        
        
    }
}
