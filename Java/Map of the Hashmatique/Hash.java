import java.util.HashMap;
import java.util.Set;
public class Hash {
    public static void main(String[] args) {
        HashMap <String, String> trackList  = new HashMap <String, String>();
        trackList.put("LoseYourself", "His balm are sweety , kness weak arms are heavy");
        trackList.put("Without Me ", "Took it so far to keep you close");
        trackList.put("Perfect", "I Found a love for me , darling follow my leaaaaaaed");
        trackList.put("Let me down slowly", "This night is cold in the Kingdom");
        String name = trackList.get("LoseYourself");
        // System.out.println(name);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + " : " + trackList.get(key));
        }
        


    }
    
}
