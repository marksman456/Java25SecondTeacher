package lesson1;

public class student {
    private String teacherAccount;
    private int score1;
    private int score2;

    public student(String inputteacherAccount, int inputScore1, int inputScore2) {
        this.teacherAccount = inputteacherAccount;
        this.score1 = inputScore1;
        this.score2 = inputScore2;
    }
    // 如果這裡有input的入口 就不建議使用建構子 除非要導向這裡的function


    public void setScore1(int inputScore1, String inputteacherAccount) {
        if (this.teacherAccount.equals(inputteacherAccount)) {
            if (inputScore1 >= 0 && inputScore1 <= 100) {
                this.score1 = inputScore1;
            }

            else {
                System.out.println("分數必須在0~100之間");
            }
        } else {

            System.out.println("帳號錯誤，無法存取分數");
        }

    }

    public int getScore1(String inputteacherAccount) {
        if (this.teacherAccount.equals(inputteacherAccount)) {
            return score1;
        } else {
            System.out.println("老師帳號錯誤");
            return -1; // 返回一個錯誤值，表示帳號錯誤
        }

    }

    public void setScore2(int inputScore2, String inputteacherAccount) {
        // 這裡的inputteacherAccount是從外部傳入的帳號
        // 這裡的this.teacherAccount是這個類別的帳號
        // 如果這兩個帳號相同 就可以存取分數
        //常量.equals(變數) 這樣寫是為了避免變數是null值時會報錯
        if (this.teacherAccount.equals(inputteacherAccount)) {
            if (inputScore2 >= 0 && inputScore2 <= 100) {
                this.score2 = inputScore2;
            }

            else {
                System.out.println("分數必須在0~100之間");
            }
        } else {

            System.out.println("帳號錯誤，無法存取分數");
        }

    }

    public int getScore2(String inputteacherAccount) {
        if (this.teacherAccount.equals(inputteacherAccount)) {
            return score2;
        } else {
            System.out.println("老師帳號錯誤");
            return -1; // 返回一個錯誤值，表示帳號錯誤
        }

    }

    @Override
     //toString()方法的使用
        // 這個方法會返回一個字串，包含了物件的類別名稱和它的hash碼
        //好處是不用一直打System.out.println()來顯示物件的內容
        //直接呼叫這個方法就可以了
        //這個方法是從Object類別繼承來的，所以所有的Java物件都可以使用這個方法
    public String toString() {
        return "student [teacherAccount=" + teacherAccount + ", score1=" + score1 + ", score2=" + score2 + "]";
    }
}