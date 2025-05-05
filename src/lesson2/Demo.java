package lesson2;

public class Demo {
    public static void main(String[] args) {
        // Animal2 animal = new Animal2();
        // animal.speak();

        // animal.bark(); 
        // 這行會報錯，因為animal是Animal類別的物件，不能使用dog類別的方法 間單來說父類別不能使用子類別的方法
       

        // dog dog1 = new dog();
        // dog1.speak();
        
        // // dog1.bark();

        // cat cat1=new cat();
        // cat1.speak();
        // // cat1.mia();
        


        Animal2 animal1 = new dog(); // 多形的概念，父類別的參考變數可以指向子類別的物件
        Animal2 animal2 = new dog();
        Animal2 animal3 = new cat();
        Animal2 animal4 = new cat();
        Animal2 animal5 = new cat();
        
        
        Animal2[] allAnimals={
            animal1,
            animal2,
            animal3,
            animal4,
            animal5
        };

        for(Animal2 allAnimalsIndex:allAnimals){
            allAnimalsIndex.speak(); // 呼叫每一個物件對應的子類別的speak()方法
        }
    }
}
