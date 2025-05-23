package HomeWork;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    public BasePlusCommissionEmployee(String name, String mobile, double commissionRate, double grossSales, double baseSalary) {
        super( name,mobile,commissionRate*1.3,grossSales,baseSalary);
    }

  
}

