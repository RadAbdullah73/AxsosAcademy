public class TestBankAccount {
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount(0.0 , 0.0);
        BankAccount acc2= new BankAccount();
        // System.out.println(BankAccount.accountCount());
        System.out.println(acc1.addDeposit("Balance" , 255.5));
        System.out.println(acc1.addDeposit("Balance" , 200));
        // System.out.println(acc1.withdraw("Balance" , 400));
        acc1.checking();
        
    }
    
}
