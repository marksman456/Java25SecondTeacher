package lesson1;

public class Bank {

    // pribvate是封裝的關鍵字
    // 只能在這個類別作使用
    // 除非使用set get去變更或提取值
    private String account;
    private int balance;

    public Bank(String registerAccount, int inputBalance) {
        this.account = registerAccount;
        this.balance = inputBalance;
    }

    public void showBalance() {
        System.out.println("Bank account:" + this.account + " balance:" + this.balance);
    }
    // 封裝
    // private值只能在這個class使用 不能在其他class使用
    // 如需更改 private值 可使用setter/getter方法
    // setter/getter方法是用來取得或設定private值的方法

    public String getAccount() {
        return this.account;
    }

    // 情境1 帳號不對時不能更改帳號
    public void setAccount(String inputAccount, String newAccount) {
        if (this.account == inputAccount) {
            this.account = newAccount;
            System.out.println("帳號已更改為" + this.account);
        } else {
           
            System.out.println("帳號輸入錯誤，無法執行更改");
        }
    }

    // getter方法是用來取得private值的方法
    public int getBalance() {
        return this.balance;
    }

    // setter方法是用來設定private值的方法

    //判斷驗證帳號是否正確情況下的情境
    //情境2 存款的時候要檢查金額是否大於0
    //情境3 提款的時候要檢查餘額是否足夠
    public void setBalance(String account, String action, int inputBalance) {

        if (account != this.account) {
            System.out.println("帳號錯誤");
        } else {
            // 如果action是存款 就增加balance的值
            if (action == "deposit")
                if (inputBalance > 0) {
                    this.balance = this.balance + inputBalance;

                } else {
                    System.out.println("存錢金額必須大於0");
                }
            // 如果action是提款 就減少balance的值
            if (action == "withdraw") {
                if (this.balance >= inputBalance) {
                    this.balance = this.balance - inputBalance;
                } else {
                    System.out.println("餘額不足");
                }
            }

        }

    }
}
