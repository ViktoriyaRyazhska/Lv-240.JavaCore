
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class Map {
  public static void main(String[] args) {
	  
    HashMap <String, String> map = new HashMap<String, String>();
   
    map.put("Alex", "Vines");
    map.put("Bob", "Dylan");
    map.put("Andrew", "White");
    map.put("Orest", "Macron");
    map.put("Walt", "Beam");
    map.put("Arthur", "King");
    map.put("Martha", "Newport");
    map.put("Chester", "Again");
    map.put("Lisa", "Crown");
    map.put("Beth", "O`Brien");
    
    

    printDetails(map);
    //map.clear();
    printDetails(map);
  }

  public static void printDetails(HashMap<String, String> map) {
    String val = map.get("Orest");
    System.out.println("Map: " + map);
    System.out.println("Map Size:  " + map.size());
    System.out.println("Map is empty:  " + map.isEmpty());
    System.out.println("Map contains 'Orest' key:   " + map.containsKey("Orest"));
    System.out.println("Value for the 'Orest' key:  " + val);
    System.out.println("Removed:  " + map.remove("Orest"));
  }
}