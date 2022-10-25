import java.util.ArrayList;
class CafeUtil {
public int getStreakGoal (){

int sum = 0 ;
for (int i = 0 ; i<=10 ; i++){
    sum += i ;
}
return sum ;
}

public int getOrderTotal(double[] lineItems){
    int sum =0 ;
    for (int i=0 ; i<lineItems.length ; i++) {
        sum+=lineItems[i];
    }
    return sum ;
}
public void displayMenu(ArrayList<String> menuItems){
    for (int i =0 ; i< menuItems.size() ; i++){
        String name = menuItems.get(i); // to access an element in an ArrayList using an index
        System.out.println(i+" " +name);
    }
}
public void addCustomer(ArrayList<String> customers){
    System.out.println("Please enter your name:");
    String userName = System.console().readLine();
    customers.add(userName);

    System.out.println("Hello " + userName + "There is " + (customers.size()-1) + " before you" );
    System.out.println(customers);


}
}




