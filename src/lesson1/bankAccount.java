package lesson1;

public class bankAccount {
    private String accountNumber; // 帳號
    private double accountBalance; // 戶名

    public bankAccount(String inputaccountNumber, double inputBalance) {
        accountNumber = inputaccountNumber;
        accountBalance = inputBalance;
    }

    public String setAccountNumber(String inputAccountNumber) {
        accountNumber = inputAccountNumber;
        return accountNumber;

    }

    public void getAccountNumber() {
        System.out.println("帳號:" + accountNumber);
    }

    public void getAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double setAccountBalance(double inputAccountBalance, String action, String accountNumber) {

        if (accountNumber == this.accountNumber) {
            if (action == "deposit") {
                accountBalance = accountBalance + inputAccountBalance;
                System.out.println("存款成功，餘額:" + accountBalance);
                return accountBalance;
            }
            if (action == "withdraw") {
                if (inputAccountBalance > accountBalance) {
                    System.out.println("餘額不足，提款失敗");
                    return accountBalance;
                } else {
                    accountBalance = accountBalance - inputAccountBalance;
                    System.out.println("提款成功，餘額:" + accountBalance);
                    return accountBalance;
                }
            } else {
                System.out.println("請輸入正確的存取款動作");
                return accountBalance;
                
            }
           
        }
        else{
            System.out.println("帳號錯誤，無法存取款");
            return accountBalance;
                
        }

    }
}