import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        Items item1 = new Items();
        item1.name="mocha";
        item1.price=3.0 ; 
        Items item2 = new Items();
        item2.name="latte";
        item2.price=2.5 ;
        Items item3 = new Items();
        item3.name="drip coffee";
        item3.price=2.0 ;
        Items item4 = new Items();
        item4.name="capuccino";
        item4.price=4.0 ;

        Orders order1 = new Orders();
        Orders order2 = new Orders();
        Orders order3 = new Orders();
        Orders order4 = new Orders();
        order1.name="Cindhuri";
        order2.name="Jimmy";
        order3.name="Noah";
        order4.name="Sam";
        // -------------
        order2.items.add(item2);
        order2.total+=item2.price;
        order2.ready=true;
        System.out.println(order2.items.get(0).name);
        // -------------
        order3.items.add(item4);
        order3.total+=item4.price;
        order3.ready=true ;
        // -------------
        order4.items.add(item2);
        // order4.total+=item2.price;
        // System.out.println(order4.total);
        order4.ready=true ;
        // -------------
        order1.ready=true;
        // -------------
        order4.items.add(item2);
        order4.items.add(item2);
        for(int i=0 ; i< order4.items.size() ; i++ ){
            order4.total+=order4.items.get(i).price ;
        }
        System.out.println(order4.total);
        

        // --------------
        order2.ready = true ;








        // System.out.println(order1);
    
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}

    
