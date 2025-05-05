package lesson1;

//題目print練習
public class Overload2 {
    public void printMessage(String message) {

        System.out.println("一個字串" + message);
    }

    public void printMessage(double message, double message2) {

        System.out.println("第一個浮點數:"+ message+"第二個浮點數:"+message2);
    }

    public void printMessage(int message, int message2, String message3) {


        //印完印完 String r1="一個整數"+message+"第二個整數"+message2;  再印 r1="一個字串"+message3;
      String r1="一個整數"+message+"第二個整數"+message2;
      r1="一個字串"+message3;

      System.out.println(r1);
    }





}


