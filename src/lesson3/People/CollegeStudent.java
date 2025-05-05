package lesson3.People;



public class CollegeStudent extends Student2 {

    private String major; // 學生姓名

    public CollegeStudent(String inputName, int inputAge, String inputStudentSchool, String inputMajor) {
        super(inputName, inputAge ,inputStudentSchool); // 呼叫父類別的建構子，並傳入姓名與年齡
        this.setMajor(inputMajor); // 設定專業
    }
   
    public void setMajor(String inputMajor) {
        this.major = inputMajor;
    }
    public String getMajor() {
        return this.major;
    }

    @Override

    public void introduce(){
        System.out.println("Hello, my name is " + super.getName() + " and I am " + super.getAge() + " years old. I study at " + super.getStudentSchool() + ". My major is " + this.getMajor() + ".");
    }




}
