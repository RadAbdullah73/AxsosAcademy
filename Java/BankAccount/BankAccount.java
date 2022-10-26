public class BankAccount{
    private double Balance ;
    private double savingBalance;
    private static int numberOfAccounts = 0;
    private static double amountOfMoney = 0.0;
    public BankAccount(){
        this.Balance=0.0;
        this.savingBalance=0.0;
        numberOfAccounts++;
        amountOfMoney=Balance+savingBalance;
        
    }
    public BankAccount(double Balance,double savingBalance ){
        this.Balance=Balance;
        this.savingBalance=savingBalance;
        numberOfAccounts++;
        amountOfMoney=Balance+savingBalance;

    }
    public static int accountCount() {
        return numberOfAccounts;
    }
    public double getBalance(){
        return Balance ;
    }
 
    public double getSavingBallance(){
        return savingBalance;
    }
    public double getTotalBalance(){
        double Total = this.Balance+this.savingBalance ;
        return Total;
    }
    public double addDeposit(String type , double amount){
        if (type=="Balance"){
            this.Balance = getBalance() + amount ;
            return this.Balance ;
        }
        else if (type=="savingBalance"){
            this.savingBalance = getSavingBallance() + amount ;
            return this.savingBalance ;
        }
        return amount ;

    } 
    public String withdraw(String type , double amount){
        if (type=="Balance"){
            if(amount > this.Balance){
                return "insufficient funds";
            }
            else{
            this.Balance = getBalance() - amount ;
            return "Your Balance = " + this.Balance ;
        }
        }
        else if (type=="savingBalance"){
            if(amount > this.savingBalance){
                return "insufficient funds";
            }
            else{
            this.savingBalance = getSavingBallance() - amount ;
            return "Your Saving Balance = " + this.savingBalance ;
            }
        }
        return "Please select a correct type ";
    } 
    public void checking(){
        System.out.println( "Your Checking balance = " + this.Balance);
        System.out.println(  "Your Saving balance = " + this.savingBalance);
        System.out.println("Total Amount of money = " +  getTotalBalance());

    }



}