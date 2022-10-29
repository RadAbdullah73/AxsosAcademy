import java.util.ArrayList;
import java.util.Random;

import javax.swing.border.EmptyBorder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CoffeeKiosk {
    private ArrayList<Items> itemsMenu = new ArrayList<Items>() ;
    private ArrayList<Orders> orders = new ArrayList<Orders>() ;

    public CoffeeKiosk(){
        this.itemsMenu = new ArrayList<Items>();
        this.orders=new ArrayList<Orders>();
    }

    public void addMenuItem ( String nm , double price){
        Items newItem = new Items();
        newItem.setName(nm);
        newItem.setPrice(price);
        itemsMenu.add(newItem);
        newItem.setIndex(itemsMenu.indexOf(newItem));
    }
    public void displayMenu(){
        for (Items i :this.itemsMenu){
            System.out.println(i.getIndex() +" "+i.getName() +" -- "+ " $"+i.getPrice() );

    }
    
}
// public double getTotal(){
//     for ( int i=0 ; i<this.itemsMenu.size() ; i++){
//         double total ;
//         total+=itemsMenu.get(i).getPrice();
//     }
//     return   ;


    public void newOrder() {
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
        Orders newOrder = new Orders(name);
        this.orders.add(newOrder);
        newOrder.display();
        displayMenu();
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        while(!itemNumber.equals("q")) {
            for(Items item:itemsMenu){
                if(item.getIndex()==Integer.parseInt(itemNumber)){
                    newOrder.addItem(item);
                }
            }
            System.out.println("Please enter a menu item index or q to quit:");
         itemNumber = System.console().readLine();
        }
        newOrder.display();
        }
    
        
    }




