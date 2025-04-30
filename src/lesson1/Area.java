package lesson1;
// 這個程式是計算長方形、三角形和圓形的面積

public class Area {

    public void cal(int a, int b) {

        if (a <= 0 || b <= 0) {
            System.out.println("長方形的長或寬不能小於等於0");

        } else {

            System.out.println("長方形面積:" + a * b);
        }

    }

    public void cal(int a, int b, String c) {
        if (a <= 0 || b <= 0) {
            System.out.println("三角形的底或高不能小於等於0");
        }
        System.out.println(c + "面積:" + a * b / 2);
    }

    public void cal(int d) {
        if (d <= 0) {
            System.out.println("圓形的半徑不能小於等於0");
        } else {

            System.out.println("圓形面積:" + (d * d * 3.14));
        }
    }

    public static void main(String[] args) throws Exception {

        Area area1 = new Area();
        area1.cal(5); // 圓形

        area1.cal(5, 10); // 長方形

        area1.cal(5, 10,"三角形"); // 三角形
    }

}