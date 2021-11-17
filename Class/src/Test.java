public class Test {
    public static void main(String[] args) {
        BankAccount b= new BankAccount();
        b.setAccountNumber(1234);
        b.setAddress("charcoal way");
        b.setName("abc");
        b.setBalance(4000);
        System.out.println("Account number:" + b.getAccountNumber());
        System.out.println("Name of account holder is:" + b.getName());
        System.out.println("Address is:" + b.getAddress());
        System.out.println(b.getAccountNumber());
        b.checkBalance();
        b.depositAmount(100);
        b.withdrawAmount(200);
    }
}

