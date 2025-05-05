package lesson3.People;

public class Student2 extends Person{
    private String studentSchool; 
    
    public Student2(String inputName,int inputAge,String inputStudentSchool) {
        super(inputName,inputAge); // 呼叫父類別的建構子，並傳入姓名與年齡
        this.setStudentSchool(inputStudentSchool); // 設定學生的學校名稱
    }
    public void setStudentSchool(String inputStudentSchool) {
        this.studentSchool = inputStudentSchool;
    }
    public String getStudentSchool() {
        return this.studentSchool;
    }

    @Override

    public void introduce(){
        System.out.println("Hello, my name is " + super.getName() + " and I am " + super.getAge() + " years old. I study at " + this.getStudentSchool() + ".");
    }

 

    
}
