package HomeWork;

public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;
    private double baseSalary;

    public CommissionEmployee(String name, String mobile, double commissionRate, double grossSales, double baseSalary) {
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
        String result = "員工基本資料";
        result += "\n姓名:" + super.getName();
        result += "\n手機:" + super.getMobile();
        result += "\n佣金比率:" + this.getCommissionRate();
        result += "\n銷售額:" + this.getGrossSales();
        result += "\n基本薪資:" + this.getBaseSalary();
        return result;
    }
}