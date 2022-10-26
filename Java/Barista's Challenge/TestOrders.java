import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        Items item1 = new Items();
        Items item2 = new Items();
        Orders order1 = new Orders();
        Orders order2 = new Orders();
        Orders order3 =new Orders();

        item1.setName("Latte");
        item1.setPrice(2.5);
        item2.setName("Coffe");
        item2.setPrice(1.5);
        order1.setName("Ahmad");
        order1.setReady(false);
        order2.setName("Khaled");
        order1.setReady(false);
        order1.addItem(item1);
        order1.addItem(item2);
        order1.display();
        System.out.println(order3.getName()); 
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());

        
        





    }
}

    
