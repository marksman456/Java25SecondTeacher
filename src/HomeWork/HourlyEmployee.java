package HomeWork;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String name, String mobile, double wage, double hours) {
        super(name, mobile);
        this.setWage(wage);
        this.setHours(hours);
    }

    public double getHours() {
        return hours;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }
    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }


@Override
public String toString(){
    String result=" Hourly員工基本資料";
    result+="\n姓名:"+super.getName();
    result+="\n手機:"+super.getMobile();
    return result;
}


@Override
public void earnings() {
    double earnings = this.getWage() * this.getHours();
    System.out.println("本月薪資:" + earnings);
}

@Override
public void getTax() {
    double tax = this.getWage() * this.getHours() * 0.05;
    System.out.println("本月稅金:" + tax);
}

@Override
public void getPaymentAmount() {
    double payment = this.getWage() * this.getHours() - (this.getWage() * this.getHours() * 0.05);
    System.out.println("本月實領金額:" + payment);

}
}


