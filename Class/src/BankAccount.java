public class BankAccount {
    public String name;
    private String address;
    private long accountNumber;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

//    public double getBalance() {
//        return balance;
//    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void checkBalance() {
        System.out.println("Balance in your account is " + balance);

    }

    public void depositAmount(double amount) {
        System.out.println("Your deposited amount is: " + amount);
        balance = balance + amount;
        System.out.println("New balance is: " + balance);
    }

    public void withdrawAmount(double amount) {
        System.out.println("Withdrawal amount is:" + amount);
        balance = balance - amount;
        System.out.println("New balance after withdraw is:" + balance);

    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}

