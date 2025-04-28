public class 課堂筆記 {

    public static void main(String[] args) throws Exception {

        // int a = 2;
        // int b = 3;
        // if ((a < b) && (a >= b)) {
        // System.out.println("條件成立");
        // } else {
        // System.out.println("條件不成立");
        // }

        // if((a==2)||(a==4)){
        // System.out.println("條件成立");

        // }
        // else{
        // System.out.println("條件不成立");
        // }

        // int scores =0;
        // if(scores>=90 && scores<=100)

        // {
        // System.out.println("你的分數為:"+scores+"很棒");
        // }

        // else if(scores>=80&&scores<=89){
        // System.out.println("你的分數為:"+scores+"很好");

        // }
        // else if(scores>=60&&scores<=79){
        // System.out.println("你的分數為:"+scores+"好");
        // }
        // else if(scores>=0&&scores<=59){
        // System.out.println("你的分數為:"+scores+"不及格");
        // }
        // else{
        // System.out.println("請輸入1~100的範圍數字");
        // }

        // 當分母為0時 可以正常執行的判斷式
        // int a = 5;
        // int b = 0;

        // if (b == 0) {
        // System.out.println("分母不能為0");
        // } else {
        // int c = a / b;
        // System.out.println(c);
        // }

        // * 簡化if else 寫法
        // * (條件) ? 條件成立時執行的程式碼 : 條件不成立時執行的程式碼
        // */
        // int a = 2;
        // int b = 3;

        // String max = (a > b) ? "A > B" : "A < B";
        // System.out.println(max);

        // 相同數字乘法不顯示

        // 練習題1
        // for (int i = 1; i <= 9; i++) {
        // for (int j = 1; j <= 9; j++) {
        // if (i == j) {
        // System.out.print("");
        // } else {

        // System.out.print(i + "*" + j + "=" + i * j + " ");
        // }
        // }
        // System.out.println();
        // }

        // for(int i=0;i<=10;i+=2){
        // System.out.println(i);
        // }

        // 練習題2 劃出正三角形
        // int rows = 6;
        // for (int i = 1; i <= rows; i++) {
        // for (int k = 1; k <= rows - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= (2 * i) - 1; j++) {
        // System.out.print("*");
        // }

        // System.out.println("");

        // }

        // 練習題3 從1-100 遇到15的倍數

        // for(int i=1;i<=100;i++){
        // if((i%15)==0){
        // System.out.println("FizzBuzz");
        // }
        // else if((i%5)==0){
        // System.out.println("Buzz");
        // }
        // else if((i%3)==0){
        // System.out.println("Fizz");
        // }
        // else{
        // System.out.println(i);
        // }
        // }

        // 倒金字塔
        // int rows = 4;
        // for (int i = 1; i <= rows; i++) {
        // for (int k = 1; k <= rows - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= (2 * i) - 1; j++) {
        // System.out.print("*");
        // }

        // System.out.println("");

        // }

        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 7; k > 2 * i; k--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for 迴圈 array元素的加總印出來
        // int[] bingo={7,22,89,55,88};
        // int sum=0;
        // for(int i=0;i<=bingo.length-1;i++){
        // sum=sum+bingo[i];
        // }
        // System.out.println(sum);

        // 找出陣列中最大值
        // int[] bingo = { 7, 22, 89, 55, 88 };
        // int max = 0;
        // for (int i = 0; i <= bingo.length - 1; i++) {
        // if (bingo[i] > max) {
        // max = bingo[i];
        // }
        // }
        // System.out.println(max);

        // for each 陣列 單獨顯示每個值

        String getResult = checkscores(60);
        System.out.println(getResult);

        String getResult2= checkArray(1,2,3);
        System.out.println(getResult2);
    }

    public static String checkArray(int a, int b, int c) {
        String result = "";
        int[] bingo = { a, b, c }; // 修正: 使用 int 型別的參數 a, b, c 建立整數陣列
        for (int nums : bingo) {
            result += nums + " "; // 修正: 使用 += 將每個元素累加到 result，並加上空格分隔
        }
        result = result.trim(); // 修正: 去除最後多餘的空格
        
        return result; // 回傳 result 的值給方法使用
    }

    

    // method 練習 寫一個成績判斷的method
    // 用string把結果印出來
    // 框框內參數是要拿來使用的值
    // 回傳的是你要接來使用的 我要拿的是result 接出來給這個方法使用
    public static String checkscores(int scores) {
        String result = "";

        if (scores >= 90 && scores <= 100) {
            result = "很棒";
        }

        else if (scores >= 80 && scores <= 89) {
            result = "很好";

        } else if (scores >= 60 && scores <= 79) {
            result = "好";
        } else if (scores >= 0 && scores <= 59) {
            result = "z不及格";
        } else {
            result = "請輸入1~100的範圍數字";
        }
        return result; // 回傳result的值給方法使用 回傳甚麼就是要使用甚麼
    }


}
