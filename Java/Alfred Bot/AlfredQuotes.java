import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format ("Hello %s ,its nice to see you here !" , name );
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "Current Date is " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1 ){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (conversation.indexOf("Alfred") != -1) {
            return "At your service.";
        }
        else{
            return "Right. And with that I shall retire.";
        }
    }
    public String guestGreeting(String name , String period) {
        return period  + name ;
    }
    public String angry(String name) {
        String string1 = name ;
        String string2 = " Gooooooooo Awaaaaaaaay";
        String string3 = string1.concat(string2);
        return string3 ;
    }
    // For sensi Bonus ********************************
    public String period(String name) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH");
        String strDate = formatter.format(date); 
        int time=Integer.parseInt(strDate);
         if(time > 5 && time <12){
           return "Good Morning " + name;
         }
        else if (time>12 && time<17){
            return"Good Afternoon " + name;
        }
        else{
            return"Good evening " + name;
        }

        }
    
}

