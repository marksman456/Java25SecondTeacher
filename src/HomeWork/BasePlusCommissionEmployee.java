package HomeWork;

public class BasePlusCommissionEmployee extends CommissionEmployee {
   

    public BasePlusCommissionEmployee(String name, String mobile, double commissionRate, double grossSales, double baseSalary) {
        super(name, mobile, commissionRate * 1.3, grossSales, baseSalary);
        
    }

    @Override
    public String toString() {
        String result = "BasePlusCommission員工基本資料";
        result += "\n姓名:" + super.getName();
        result += "\n手機:" + super.getMobile();
        return result;
    }
}