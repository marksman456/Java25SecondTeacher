package HomeWork;


public class Employee extends Earning implements IPayable, IInvoice {

    private String name;
    private String mobile;

public Employee (String name ,String mobile){
   this.setName( name);
   this.setMobile(mobile);
}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
       return"";
    }

    @Override
    public void earnings() {

    }

    @Override
    public void getTax() {

    }

    @Override
    public void getPaymentAmount(){

    }
    
    
    
   
}
