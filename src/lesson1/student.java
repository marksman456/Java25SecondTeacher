package lesson1;
public class student {
    private String name;
    private int score;


  
    public void showStudentscore() {
        System.out.println("學生姓名: " + this.name + ", 學生成績: " + this.score);

    }

    //如果這裡有input的入口 就不建議使用建構子 除非要導向這裡的function
    public void setName(String inputName) {
        this.name = inputName;
    }

    public String getName() {
        return this.name;
    }

    public void setScore(int inputScore) {
        

    if(inputScore>=0 && inputScore<=100){
        this.score =inputScore;
    }else{
        System.out.println("成績不在範圍內，請重新輸入0~100的成績");
    }
}


    public int getScore() {
        return this.score;
    }

}