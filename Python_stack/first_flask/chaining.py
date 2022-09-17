class User : 
    def __init__ (self , name , account_balance):
        self.name=name
        self.account_balance = account_balance
    def make_withdrawl(self , amount):
        self.account_balance -=amount
        return self
    def make_deposits(self , amount):
        self.account_balance +=amount
        return self 
        # print(Ahmed.account_balance)
    # def display_user_balance(self)
    def transfer_money(self, other_user ,amount):
        self.account_balance -= amount
        other_user .account_balance += amount
        return self

Ahmed = User('Ahmed' , 100)
Ayman = User('Ayman' , 200)
Ali = User('Ali' , 500)
Ahmed.make_deposits(200).make_deposits(100).make_deposits(400).make_withdrawl(500)
print(Ahmed.account_balance)





   