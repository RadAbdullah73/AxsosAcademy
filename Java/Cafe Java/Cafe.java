public class Cafe {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffePrice = 4;
        double cappuccino = 2.5;
        int latte = 3;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
        boolean isReadyOrderForSam = true;


        if(isReadyOrder1) {
            System.out.println(generalGreeting + customer1);
            System.out.println("The order is ready , total price is " + mochaPrice);
        }
        else {
            System.out.println("Sorry , order isn't ready yet");
        }
        if(isReadyOrder2) {
            System.out.println(generalGreeting + customer4);
            System.out.println("The order is ready , total price is " + latte);
        }
        else {
            System.out.println("Sorry , order isn't ready yet");
        }
        if(isReadyOrderForSam) {
            System.out.println(generalGreeting + customer2);
            System.out.println("The order is ready , total price is " + 2*latte);
        }
        else {
            System.out.println("Sorry , order isn't ready yet");
        }
        if(isReadyOrder3) {
            System.out.println(generalGreeting + customer3);
            System.out.println("The order is ready , total price is " + (dripCoffePrice-latte));
        }
        else {
            System.out.println("Sorry , order isn't ready yet");
        }

        // orrr 
        // if(isReadyOrder2) {
        //     System.out.println(generalGreeting + customer2);
        //     System.out.println("The order is ready , total price is " + 2*latte);
        // }
        // else {
        //     System.out.println("Sorry , order isn't ready yet");
        // }



    
    }
}
