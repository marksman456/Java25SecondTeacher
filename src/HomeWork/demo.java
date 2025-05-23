package HomeWork;

public class demo {
    public static void main(String[] args) {
       
        Employee e1 = new HourlyEmployee("小明", "0912345678", 200, 160);
        System.out.println(e1.toString());

        e1.earnings();
        e1.getTax();
        e1.getPaymentAmount();

        

    }
}
