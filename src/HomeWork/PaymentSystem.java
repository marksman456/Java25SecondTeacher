package HomeWork;

public class PaymentSystem {
    public static void main(String[] args) {
        

        Employee e1 = new HourlyEmployee("小明", "0912345678", 200, 160);
        System.out.println(e1.toString());
        e1.earnings();
        e1.getTax();
        e1.getPaymentAmount();
        System.out.println("====================================");
        Employee e2 = new SalariedEmployee("小華", "0987654321", 0.1, 10000, 30000);
        System.out.println(e2.toString());
        e2.earnings();
        e2.getTax();
        e2.getPaymentAmount();
        System.out.println("====================================");
        Employee e3 = new CommissionEmployee("小美", "0912345678", 0.1, 10000, 30000);
        System.out.println(e3.toString());
        e3.earnings();
        e3.getTax();
        e3.getPaymentAmount();
        System.out.println("====================================");
        Employee e4 = new BasePlusCommissionEmployee("老王", "0912345678", 0.1, 10000, 30000);
        System.out.println(e4.toString());
        e4.earnings();
        e4.getTax();
        e4.getPaymentAmount();

    }
}
