import java.util.HashMap;
import java.util.Set;
public class Map{
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("dont you need somebody", "dont you need somebody");
        map.put("Shape of You", "I'm in love with the shape of you.");
        map.put("Waka Waka", "You're all Africa's soldiers, come and celebrate.");
        map.put("Live It Up", "We came here to celebrate, live it up tonight.");
        map.get("Shape of You");
        Set <String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(map.get(key));
        }

    }
}