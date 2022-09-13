class BankAccount:
    def __init__(self , name , int_rate):
        self.name = name
        self.int_rate=int_rate
        self.account_balance = 0

    
    def make_deposit(self , amount):
        self.account_balance +=amount 
    def make_withdrawl(self,amount):
        if self.account_balance > amount:
            self.account_balance -=amount
        else:
            print('Insufficient funds')
    def display_account_info(self):
        print("account_balance",self.account_balance , "int_rate" , self.int_rate)
    def yield_interest(self):
        if self.account_balance > 0:
            self.account_balance += self.account_balance * self.int_rate

AhmedAccount=BankAccount('Ahmed' , 0.01 )
SaedAccount= BankAccount('Saed' , 0.02)
AhmedAccount.make_deposit(100) , AhmedAccount.make_deposit(200) , AhmedAccount.make_deposit(50) , AhmedAccount.make_withdrawl(100) , AhmedAccount.yield_interest() , AhmedAccount.display_account_info()
SaedAccount.make_deposit(100) , SaedAccount.make_deposit(400) , SaedAccount.make_withdrawl(50) , SaedAccount.make_withdrawl(50) , SaedAccount.make_withdrawl(50) , SaedAccount.make_withdrawl(100) , SaedAccount.make_withdrawl(100) , SaedAccount.yield_interest() , SaedAccount.display_account_info()  