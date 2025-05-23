package HomeWork;

public class SalariedEmployee extends Employee {
    private double commissionRate;
    private double grossSales;
    private double baseSalary;

    public SalariedEmployee(String name, String mobile, double commissionRate, double grossSales, double baseSalary) {
        super(name, mobile);
        this.setCommissionRate(commissionRate);
        this.setGrossSales(grossSales);
        this.setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public String toString() {
        String result = "SalariedEmployee員工基本資料";
        result += "\n姓名:" + super.getName();
        result += "\n手機:" + super.getMobile();
    
        return result;
    }

    @Override
    public void getTax() {
        double tax = (this.getBaseSalary() + this.getGrossSales() * this.getCommissionRate()) * 0.05;
        System.out.println("本月稅金:" + tax);
    }

    @Override
    public void earnings() {
        double earnings = this.getBaseSalary() + this.getGrossSales() * this.getCommissionRate();
        System.out.println("本月薪資:" + earnings);
    }
@Override
    public void getPaymentAmount() {
        double payment = (this.getBaseSalary() + this.getGrossSales() * this.getCommissionRate()) - ((this.getBaseSalary() + this.getGrossSales() * this.getCommissionRate()) * 0.05);
        System.out.println("本月實領金額:" + payment);
    }

}