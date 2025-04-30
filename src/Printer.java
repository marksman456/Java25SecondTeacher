public class Printer {

    //多載
    //方法名稱相同 但參數不同(數量或類型不同) 這叫做多載
    public void show() {
        System.out.println("沒任何輸入");
    }

    public void show(String text) {
        System.out.println("單一文字輸入" + text);
    }

    public void show(int number) {
        System.out.println("單一數字輸入" + number);
    }

    public void show(int number, String text) {
        System.out.println("不同類型多個輸入" + number + "text:" + text);
    }
}
