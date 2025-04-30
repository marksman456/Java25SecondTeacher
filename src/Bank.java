public class Bank {
    private String account;
    private int balance;

    public Bank(String registerAccount,int inputBalance) {
        this.account=registerAccount;
        this.balance=inputBalance;
    }

    public void showBalance() {
        System.out.println("Bank account:" + this.account + " balance:" + this.balance);
    }
//封裝
    //private值只能在這個class使用 不能在其他class使用
    //如需更改 private值 可使用setter/getter方法
    //setter/getter方法是用來取得或設定private值的方法

    public String getAccount() {
        return this.account;
    }
    public void setAccount(String inputAccount) {
        this.account =  inputAccount;
    }

    //getter方法是用來取得private值的方法
    public int getBalance() {
        return this.balance;
    }

    //setter方法是用來設定private值的方法
    //這個方法是用來增加balance的值
    public void setBalance(int inputBalance) {
        if (inputBalance>0) {
            this.balance =this.balance+inputBalance;

        }
        else {
            System.out.println("存錢金額必須大於0");
        }
       
    }
}
