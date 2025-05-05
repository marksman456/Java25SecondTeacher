package lesson3.People;

public class 學生覆寫 {
    public static void main(String[] args) {

        Student2 student1 = new Student2("456", 19, "前鎮國中");

        // student1.introduce(); // 呼叫父類別的 introduce() 方法

        CollegeStudent student2 = new CollegeStudent("789", 20, "國防醫學院", "醫學系");

        // student2.introduce();

        // 多形練習

        Person student3 = new Student2("456", 19, "前鎮國中");
        // student3.introduce(); // 呼叫 Student2 的 introduce() 方法

        // 這裡的 student4 是 Person 類別的參考變數，但實際上它指向的是 CollegeStudent 物件
        Person student4 = new CollegeStudent("789", 20, "國防醫學院", "醫學系");
        // student4.introduce(); // 呼叫 CollegeStudent 的 introduce() 方法



        // 多形陣列練習 //通常會用最上層的類別來宣告陣列，然後放入子類別的物件
        // 這樣就可以用同一個陣列來存放不同類別的物件，這就是多形的概念
        Person[] allperson = { new Student2("456", 19, "前鎮國中"),
                new CollegeStudent("789", 20, "國防醫學院", "醫學系"),
                new CollegeStudent("10", 21, "國防部", "戰爭系"),
        };

        // 也等於 先建立完物件後，再放入陣列裡面 同樣也是person類別裡的物件
        Person[] allperson2 = {
                student3,
                student4,
                student2,
        };




        // // 取Person類別 array 裡面的index的值 這裡的people是每一個person的索引值
        // for (Person people : allperson) {
        //     people.introduce(); // 呼叫每一個物件對應的子類別的introduce()方法
        // }

        for (int i = 0; i <= allperson2.length - 1; i++) {
            allperson2[i].introduce(); // 呼叫每一個物件對應的子類別的introduce()方法
        }

    }

}
