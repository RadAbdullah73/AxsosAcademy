import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Expect{
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        myList.add("fdgdfgdfgfd World");


        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(myList.get(i) + " at index " + i + " have integer value ");
            }
            catch (Exception  e){
            System.out.println(e);
            System.out.println(myList.get(i) + " at index " + i);
            

            }

         
        }
        
        


    }
}