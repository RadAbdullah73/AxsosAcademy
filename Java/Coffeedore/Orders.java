import java.util.ArrayList;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Orders{
    private String name;
    private double total ;
    private boolean ready;
    private ArrayList<Items> items = new ArrayList<Items>() ;

    public String getName() {
        return name;
    }
    public void setName(String nm){
        name = nm ; 

    }
    // public double getTotal(){
    //     return total ;
    // }
    // public void setTotal(double tot){
    //     total = tot ;
    // }
    public boolean getReady(){
        return ready ; 
    }
    public void setReady(boolean read){
        ready = read ;
    }
    public ArrayList<Items> getItems(){
        return items ;
    } 
    public void addItem(Items it){
        items.add(it);
    }
    public Orders(){
        this.name="Guest";
    }
    public Orders(String name){
        this.name=name ;
    }
    public String getStatusMessage(){
        if (this.ready == true){
            return "Your order is ready." ;
        }
        else {
            return "Thank you for waiting. Your order will be ready soon." ;
        }

    }
    public void display(){
        System.out.println("Customer name : " + name);
        for (int i=0 ; i<this.items.size() ; i++){
            System.out.println(items.get(i).getName() + "-" + items.get(i).getPrice());
        }
        System.out.println("Total: "+getOrderTotal());
    }
    public double getOrderTotal(){
        for ( int i=0 ; i<this.items.size() ; i++){
            this.total+=items.get(i).getPrice();
        }
        return total ;
    

    }


}