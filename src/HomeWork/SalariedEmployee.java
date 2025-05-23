package HomeWork;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String name, String mobile, double weeklySalary) {
        super(name, mobile);
        this.setWeeklySalary(weeklySalary);
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklySalary=" + weeklySalary +
                ", name='" + getName() + '\'' +
                ", mobile='" + getMobile() + '\'' +
                '}';
    }

    @Override
    public void earnings() {
        System.out.println("Earnings: " + getWeeklySalary());
    }

    @Override
    public void getTax() {
        System.out.println("Tax: " + (getWeeklySalary() * 0.1));
    }

    @Override
    public void getPaymentAmount() {
        System.out.println("Payment Amount: " + (getWeeklySalary() - (getWeeklySalary() * 0.1)));
    }
    
}
