class BankAccount:
    def __init__(self , amount , int_rate ):
        self.int_rate=int_rate
        self.account_balance = amount
    def make_deposit(self , amount):
        self.account_balance +=amount
        return self 
    def make_withdrawl(self,amount):
        if self.account_balance>= amount:
            self.account_balance -=amount
        else:
            print('Insufficient funds')
        return self
    def display_account_info(self):
        print("account_balance",self.account_balance , "int_rate" , self.int_rate)
    def yield_interest(self):
        if self.account_balance > 0:
            self.account_balance += self.account_balance * self.int_rate
        return self
class User : 
    def __init__(self , name , amount ):
        self.name=name
        self.account= BankAccount( amount , int_rate=0.01)
    def make_withdrawl(self , amount ):
        self.account.make_withdrawl(amount)
    def make_deposits(self , amount):
        self.account.make_deposit(amount)
    def transfer_money(self, other_user ,amount):
        self.account.account_balance -= amount
        other_user.account.account_balance += amount
Ahmed = User('Ahmed' , 100)
Ayman = User('Ayman' , 200)
Ali = User('Ali' , 500)
Ali.make_withdrawl(500)
Ayman.make_deposits(600)
print(Ali.account.account_balance)
print(Ayman.account.account_balance)
